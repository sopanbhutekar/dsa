package heap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KadanesAlgorithm {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		//Kadane's Algorithm		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int size=Integer.parseInt(br.readLine());
			int [] array= new int[size];			
			String[] temp=(br.readLine()).split(" ");
			for(int p=0;p<temp.length;p++){
				array[p]=Integer.parseInt(temp[p]);
			}
			int localSum=array[0];
			int globalSum=array[0];
			
			for(int p=1;p<array.length;p++){
				localSum=Math.max(array[p],localSum+array[p]);
				globalSum=Math.max(globalSum,localSum);
			}
			
			System.out.println(globalSum);
		}
		

}
}
