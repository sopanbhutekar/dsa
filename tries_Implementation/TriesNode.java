package heap.tries_Implementation;

public class TriesNode {

	Character data;
	TriesNode [] children;
	boolean isEndOfString;
	
	TriesNode(int size)
	{
		isEndOfString=false;
		children=new TriesNode[size];
		for(int i=0;i<size;i++){
			children[i]=null;
		}
	}	
	
}
