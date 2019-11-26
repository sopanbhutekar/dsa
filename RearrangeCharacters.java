package heap;
import java.io.*;
import java.util.*;

public class RearrangeCharacters {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		PrintWriter pr=new PrintWriter(System.out,true);
		for(int i=0;i<t;i++){
			String str=br.readLine();
			pr.println(reArrangeCharacters(str));
		}

	}
	
	public static int reArrangeCharacters(String str){
		int max=0;
		Map<Character, Integer> temp=new HashMap<Character, Integer>(); 
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(temp.get(ch)!=null){
				int count=temp.get(ch)+1;
				temp.put(ch,count);
				if(count>max){
					max=count;
				}
			}else{
				temp.put(ch,1);
			}
		}
		//System.out.println(" Max: "+max+" Map: "+temp);
		if(max>(str.length()+1)/2)
			return 0;
		else{
			return 1;
		}
	}

}
