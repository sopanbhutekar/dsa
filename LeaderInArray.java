package heap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class LeaderInArray {

	public static void main(String[] args)throws NumberFormatException, IOException {
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
			//Logic Starts here
			String str=FindLeadersInArray(array1);
			PrintWriter writer= new PrintWriter(System.out,true);
			writer.println(str);			
		}

	}
	
	public static String FindLeadersInArray(int []array)
	{
		if(array.length==1){
			return ""+array[0];
		}
		int LCount=0;
		int max=array[array.length-1];
		int []result=new int[array.length];
		result[LCount++]=array[array.length-1];
		//Find MAX for Respective Index
		for(int i=array.length-2;i>=0;i--){
			if(array[i]>=max){
				result[LCount++]=array[i];
				max=array[i];
			}
		}
		StringBuilder str=new StringBuilder();
		for(int i=LCount-1;i>=0;i--){
			str.append(result[i]);
			if(i>0){
				str.append(" ");
			}
		}
		return new String(str);
	}

}
