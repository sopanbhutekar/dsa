import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class EquilibriumIndex {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n=Integer.parseInt(br.readLine());			
			int [] array1= new int[n];
			String [] temp=(br.readLine()).split(" ");
			for(int p=0;p<temp.length;p++){
				array1[p]=Integer.parseInt(temp[p]);
			}
			//Logic Start Here
			int index=FindPivotIndex(array1);		
			PrintWriter writer= new PrintWriter(System.out,true);
			writer.println(index);
		}

	}
	
	public static int FindPivotIndex(int [] array)
	{
		//Array with Single element
		if(array.length==1){
			return array[0];
		}
		int rSum=0,lSum=0;
		//Sum of Array
		for(int i=0;i<array.length;i++){
			rSum+=array[i];
		}
		rSum-=array[0];		
		for(int i=1;i<array.length;i++){
			lSum+=array[i-1];
			rSum-=array[i];
			if(lSum==rSum){
				return i+1;
			}
		}	
		
		return -1;
	}

}
