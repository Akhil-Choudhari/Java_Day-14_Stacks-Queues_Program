package LinkedListProgram;

public class AkhilQueues<T> {

LinkedList<T> myLinkedList;
	
	public AkhilQueues(){
		myLinkedList = new LinkedList<T>();
	}
	
	public void enqueue(T data){
		myLinkedList.add(data);
	}
	public T dequeue(){
		return myLinkedList.pop(0);
	}
	

	public boolean isEmpty(){
		return myLinkedList.isEmpty();
	}
	
	public int size(){
		return myLinkedList.size();
	}
}

