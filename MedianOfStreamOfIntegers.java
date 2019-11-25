package heap;

import java.util.*;
import java.io.*;

public class MedianOfStreamOfIntegers {

	public static void main(String[] args)throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> min=new PriorityQueue<Integer>();
		PriorityQueue<Integer> max=new PriorityQueue<Integer>(Collections.reverseOrder());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr=new PrintWriter(System.out,true);
		int n=Integer.parseInt(br.readLine());
		int result[] =new int[n];
		for(int i=0;i<n;i++){
			int e=Integer.parseInt(br.readLine());
			int median=0;
			//Insert Element
			if(max.peek()==null){
				max.add(e);
			}
			else if(e<max.peek()){
				if(max.size()>min.size()){
					min.add(max.poll());
					max.add(e);
				}else{
					max.add(e);
				}
			}else{
				if(min.size()>max.size()){
					max.add(min.poll());
					min.add(e);
				}else{
					min.add(e);
				}
			}
			
			//Extract Median
			if(max.size()>min.size()){
				median=max.peek();
			}else if(min.size()>max.size()){
				median=min.peek();
			}else{
				median=(min.peek()+max.peek())/2;
			}
			//Print Median
			//pr.println(median);
			result[i]=median;
		}
		
		for(int p:result){
			pr.println(p);
		}

	}

}
