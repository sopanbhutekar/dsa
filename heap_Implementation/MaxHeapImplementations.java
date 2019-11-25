
package heap.heap_Implementation;


public class MaxHeapImplementations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxHeap max=new MaxHeap();
		max.insert(22);
		max.insert(30);
		max.insert(8);
		max.insert(50);
		max.insert(60);
		max.insert(8);
		max.insert(40);
		max.insert(3);
		max.insert(81);
		System.out.println(max);
		System.out.println(max.pop());
		System.out.println(max);
		System.out.println(max.pop());
		System.out.println(max);
	}

}
