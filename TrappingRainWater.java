package heap;

import java.io.*;

public class TrappingRainWater {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr=new PrintWriter(System.out,true);
		
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n=Integer.parseInt(br.readLine());
			int []num= new int[n];
			String [] str=(br.readLine()).split(" ");
			for(int j=0;j<str.length;j++){
				num[j]=Integer.parseInt(str[j]);
			}
			pr.println(FindTrappedWater(num));
		}
	}
	
	public static int FindTrappedWater(int [] num)
	{
		int sum=0;
		int ref=0,left=0,right=0;
		for(int i=1;i<num.length-1;i++){
			left=num[i];
			for(int j=0;j<i;j++){
				left=Math.max(left, num[j]);
			}
			right=num[i];
			for(int j=i+1;j<num.length;j++){
				right=Math.max(right, num[j]);
			}
			ref=Math.min(left, right);			
			sum+=ref-num[i];
			
		}		
		return sum;
	}

}
