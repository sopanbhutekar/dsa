package heap;

import java.io.*;
import java.util.*;

public class KthLargestElementInStream {

	public static void main(String[] args)throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		PrintWriter pr=new PrintWriter(System.out,true);
		for(int i=0;i<t;i++){
			String []str=(br.readLine()).split(" ");
			int k=Integer.parseInt(str[0]);
			int n=Integer.parseInt(str[1]);
			int []stream=new int[n];
			String []num=(br.readLine()).split(" ");
			for(int j=0;j<num.length;j++){
				stream[j]=Integer.parseInt(num[j]);
				
			}
			pr.println(findKthLargestElement(stream,k));
		}
	}
	
	public static String findKthLargestElement(int []stream,int k){
		StringBuilder result=new StringBuilder();
		PriorityQueue<Integer> min=new PriorityQueue<Integer>();
		for(int i=0;i<stream.length;i++){
			int temp=0;
			min.add(stream[i]);
			
			if(min.size()<k){
					temp=-1;				
			}else if(min.size()>k){
				min.poll();
				temp=min.peek();
			}else{
				temp=min.peek();
			}
			result.append(temp);
			if(i!=stream.length){
				result.append(" ");
			}
		}	
		
		return new String(result);
	}

}
