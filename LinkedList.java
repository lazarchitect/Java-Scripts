public class LinkedList{
	
	Node head;
	//Node tail;
	int size;
	
	public LinkedList(Object x){
		head = x;
		size = 1;
	}
	
	public LinkedList(){
		head = null;
		size = 0;
	}
	
	public void insertFront(Object x){
		head = new Node(x, head);
		size++;
	}
/*	public void insertEnd(Object x){
		Node a = new Node(x, null);
		tail.next = a;
		size++;
	}
*/	
	
	
	
	
}