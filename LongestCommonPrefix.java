package heap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestCommonPrefix {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int size=Integer.parseInt(br.readLine());
			String []str=(br.readLine()).split(" ");
			System.out.println(FindLongestCommonPrefix(str));
		}
	}
	
	public static String FindLongestCommonPrefix(String []str){
		StringBuilder result=new StringBuilder();
		int index=0;
		while(index<str[0].length()){
			char ch=str[0].charAt(index);
		for(int j=1;j<str.length;j++){
			
			if(index>=str[j].length()){
				return new String(result);
			}
				if(ch!=str[j].charAt(index)){
					if(index>0){
					return new String(result);
					}else{
						return "-1";
					}
				}					
		}
		
		result.append(ch);
		if(index<str[0].length()){
		index++;	
		}
		//System.out.println("Index: "+index+" result: "+result+" ch: "+ch);
	}
		//System.out.println("Test");
		return new String(result);
	}

}
