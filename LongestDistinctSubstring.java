package heap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LongestDistinctSubstring {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String str=br.readLine();
			//Logic start Here
			System.out.println(FindLongestDistinctSubstring(str));
			
		}
	}
	
	public static int FindLongestDistinctSubstring(String str)
	{
		int max=0;
		String result="";
		Set<Character> count=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++){
			count.clear();
			for(int j=i;j<str.length();j++){				
				while(j<str.length()&&count.add(str.charAt(j))){
					if(j<str.length()){
					j++;
					}
				}				
				if((j-i)>max){
					max=j-i;
					result=str.substring(i,j);					
				}
				j=str.length();
				//System.out.println(" Max: "+max+" Result: "+result+" Set: "+count);
			}
		}
		return max;
	}

}
