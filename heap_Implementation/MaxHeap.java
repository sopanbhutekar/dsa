package heap.heap_Implementation;

public class MaxHeap {

	//This will be implementation of Max Heap
	//We will be using Fixed Size array to make sure our focus is on Maxheap only
	int [] heap;
	int size=0;
	MaxHeap()
	{
		heap=new int[50];
	}
	
	public int parent(int i){
		if(i==0){
			return 0;
		}else{
			return (i-1)/2;
		}
	}
	
	public int leftChild(int i){
		return (2*i+1);
	}
	
	public int rightChild(int i){
		return (2*i+2);
	}
	
	public void swap(int i,int j){
		int temp=heap[i];
		heap[i]=heap[j];
		heap[j]=temp;
	}
	
	public void insert(int element)
	{
		heap[size++]=element;
		//Make MaxHeap Balance
		int index=size-1;
		while(index>=0){
			int IParent=parent(index);
			if(heap[index]>heap[IParent]){
				swap(index,IParent);
				index=IParent;
			}else{
				break;
			}		
		}		
		
	}
	
	public int pop()
	{
		int result=heap[0];
		heap[0]=heap[--size];
		int index=0;		
		while(index<=size){
			int child;
			int lChild=leftChild(index);
			int rChild=rightChild(index);
			if(heap[rChild]>heap[lChild]){
				child=rChild;
			}else{
				child=lChild;
			}
			if(heap[child]>heap[index]){
				swap(child,index);
				index=child;
			}else{
				break;
			}
		}
		
		return result;
	}

	public String toString()
	{
		StringBuilder str=new StringBuilder();
		for(int i=0;i<size;i++){
			str.append(heap[i]);
			if(i!=heap.length){
				str.append(" ");
			}		
		}
		return new String(str);
	}
	
	
	
}
