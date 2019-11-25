import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class NumberOfPairs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//Output: Corresponding to each test case, print in a new line, the number of pairs such that x^y > y^x.
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String[] temp=(br.readLine()).split(" ");
			int cap1=Integer.parseInt(temp[0]);
			int cap2=Integer.parseInt(temp[1]);
			int [] array1= new int[cap1];
			int [] array2= new int[cap2];
			temp=(br.readLine()).split(" ");
			String[] temp2=(br.readLine()).split(" ");
			for(int p=0;p<temp.length;p++){
				array1[p]=Integer.parseInt(temp[p]);
			}
			for(int p=0;p<temp2.length;p++){
				array2[p]=Integer.parseInt(temp2[p]);
			}
			int count=FindCount(array1,array2);
			System.out.println(count);
			
		}

	}
	
	public static int FindCount(int []array1, int [] array2)
	{
		int count=0;
		for(int i=0;i<array1.length;i++){
			for(int j=0;j<array2.length;j++){
				if(Math.pow(array1[i],array2[j])>Math.pow(array2[j],array1[i]))
				{
					count++;
				}
			}
		}
		
		return count;
	}

}
