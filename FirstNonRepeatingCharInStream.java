package heap;

import java.io.*;
import java.util.*;

public class FirstNonRepeatingCharInStream {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n=Integer.parseInt(br.readLine());
			String [] input= (br.readLine()).split(" ");
			String result=FindFirstNonRepeatingChar(input);
			System.out.println(result);
		}
		
	}
	
	public static String FindFirstNonRepeatingChar(String [] input)
	{
		StringBuilder result=new StringBuilder();
		String firstChar="-1";
		Set<Character> heap=new LinkedHashSet<Character>();
		Set<Character> orderedHeap=new LinkedHashSet<Character>();		
		for(int i=0;i<input.length;i++){
			char ch=input[i].charAt(0);
			if(heap.add(ch))
			{
				orderedHeap.add(ch);
				if(firstChar=="-1"){
					firstChar=""+ch;
				}
				
			}else{
				
				if(firstChar.equals(""+ch)){
				firstChar=nextChar(orderedHeap,firstChar.charAt(0));
				//firstChar=""+orderChar[++index];
				}					
				orderedHeap.remove(ch);				
			}
			result.append(firstChar);
			if(i!=input.length)
			{
				result.append(" ");
			}
		}		
		return new String(result);
	}

	public static String nextChar(Set<Character> heap,char ch)
	{		
		if(heap.size()==0){
			return "-1";
		}
		boolean gotIt=false;
		for(Character temp:heap){
			if(gotIt){
				return ""+temp;
			}
			if(ch==temp){
				gotIt=true;
			}
		}		
		
		return "-1";
	}
}
