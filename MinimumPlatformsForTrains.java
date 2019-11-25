package heap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MinimumPlatformsForTrains {

	public static void main(String[] args)throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n=Integer.parseInt(br.readLine());			
			int [] arrival= new int[n];
			int [] dep=new int[n];
			String [] temp1=(br.readLine()).split(" ");
			String [] temp2=(br.readLine()).split(" ");
			for(int p=0;p<temp1.length-1;p++){
				arrival[p]=Integer.parseInt(temp1[p]);
			}
			for(int p=0;p<temp2.length-1;p++){
				dep[p]=Integer.parseInt(temp2[p]);
			}			
			//Logic Starts Here
			//int count=FindMinimumPlateformRequired(arrival,dep);
			int count=FindMinPlatform(arrival,dep);
			System.out.println(count);
		}
	}
	
	public static int FindMinPlatform(int [] arr, int [] dep)
	{
		//Time Complexity: O(nlogn)
		Arrays.sort(arr);
		Arrays.sort(dep);
		int n=arr.length;
		int platform=0, result=0;
		int i=0,j=0;
		while(i<n&&j<n){
			
			if(arr[i]<=dep[j])
			{
				platform++;
				i++;
				
				if(platform>result){
					result=platform;
				}
			}else{
				platform--;
				j++;
			}
			
		}
		
		return result;		
	}
	

}
