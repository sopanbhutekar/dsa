package heap;
import java.io.*;

public class MergeTwoSortedArrayWithoutExtraSpace {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String[] temp=(br.readLine()).split(" ");
			int cap1=Integer.parseInt(temp[0]);
			int cap2=Integer.parseInt(temp[1]);
			int [] array1= new int[cap1];
			int [] array2= new int[cap2];
			temp=(br.readLine()).split(" ");
			String[] temp2=(br.readLine()).split(" ");
			for(int p=0;p<temp.length;p++){
				array1[p]=Integer.parseInt(temp[p]);
			}
			for(int p=0;p<temp2.length;p++){
				array2[p]=Integer.parseInt(temp2[p]);
			}
			//Starting of Logic
			mergeWithoutSpace(array1,array2,cap1,cap2);
			//System.out.println("After Merging: ");		
			printArray(array1);
			printArray(array2);
		}		

	}
	
	public static void printArray(int []array){		
		//System.out.print("[ ");
		PrintWriter writer= new PrintWriter(System.out,true);
		StringBuilder test=new StringBuilder();
		for(int i=0;i<array.length;i++){
			test=test.append(array[i]).append(" ");
		}
		String str=new String(test);
		str=str.substring(0, str.length()-1);
		writer.println(str);
	}
	
	public static void mergeWithoutSpace(int []array1, int [] array2, int cap1, int cap2){
	
		int pos2=0,pos1=0,temp=0;
		int gap=(int)Math.ceil((cap1+cap2)/2.0);
		//[0 - Cap1-1] Array1
		//[cap1 - cap1+cap2-1] Array2
		boolean hit=true;
		while(gap>=1){
			//System.out.println(" Gap: "+gap);
			printArray(array1);
			printArray(array2);
			for(int i=0;i<cap1+cap2-gap;i++){
				pos1=i;
				pos2=i+gap;
				//System.out.println("Pos1: "+pos1+" Pos2: "+pos2);
				if(pos1>=cap1){
					pos1=pos1-cap1;
					pos2=pos2-cap1;
					if(array2[pos1]>array2[pos2]){
					//	System.out.println("IF: Swap between "+array2[pos1]+" "+array2[pos2]);
						temp=array2[pos1];
						array2[pos1]=array2[pos2];
						array2[pos2]=temp;
					}
				}else if(pos1<cap1 && pos2>=cap1){
					pos2=pos2-cap1;
					if(array1[pos1]>array2[pos2]){
						//System.out.println("ELSE if: Swap between "+array1[pos1]+" "+array2[pos2]);
						temp=array1[pos1];
						array1[pos1]=array2[pos2];
						array2[pos2]=temp;
					}
				}else {
					if(array1[pos1]>array1[pos2]){
					//	System.out.println(" ELSE: Swap between "+array1[pos1]+" "+array1[pos2]);
						temp=array1[pos1];
						array1[pos1]=array1[pos2];
						array1[pos2]=temp;
					}
				}				
				
			}			
			gap=gap/2;
			if(gap==0&&hit==true){
				gap=1; hit=false;
			}
		}
		
	}

}
