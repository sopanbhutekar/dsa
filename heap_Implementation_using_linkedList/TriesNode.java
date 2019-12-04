package heap.heap_Implementation_using_linkedList;
import java.util.*;

public class TriesNode {

	Character data;
	List<TriesNode> childrens=new ArrayList<TriesNode>();
	boolean isEndOfString;
	
	TriesNode()
	{
		isEndOfString=false;		
	}	
	
}
