package heap;
import java.io.*;


public class LongestPalindrom {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String str=br.readLine();
			String result=FindLongestPalindrom(str);
			System.out.println(result);			
		}
	}
	
	public static String FindLongestPalindrom(String str)
	{
		String result="";
		int max=0;
		for(int i=0;i<str.length();i++){			
			String tmp="";
			for(int j=i;j<str.length();j++){
				tmp+=str.charAt(j);
				if(isPalindrom(tmp)&&tmp.length()>max){
					result=tmp;
					max=tmp.length();
				}				
			}
		}
		
		return result;
	}
	
	public static boolean isPalindrom(String test){
		StringBuilder tmp=new StringBuilder(test);
		return test.equalsIgnoreCase(new String(tmp.reverse()));			
	}
	

}
