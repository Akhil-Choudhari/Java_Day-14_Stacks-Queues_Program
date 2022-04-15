package LinkedListProgram;

public class AkhilStack<T> {
LinkedList<T> myLinkedList;
	
	public AkhilStack(){
		myLinkedList = new LinkedList<T>();
	}
	
	public void push(T data){
		myLinkedList.add(data);
	}
	
	public T pop(){
		return myLinkedList.pop();
	}
	
	public T peek(){
		T temp = myLinkedList.pop();
		myLinkedList.add(temp);
		return temp;
	}
	public boolean isEmpty(){
		return myLinkedList.isEmpty();
	}
	
	public int size(){
		return myLinkedList.size();
	}
}

