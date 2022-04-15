package LinkedListProgram;

public class AkhilStack<T> {
MyLinkedList<T> myLinkedList;
	
	public MyStack(){
		myLinkedList = new MyLinkedList<T>();
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
}

