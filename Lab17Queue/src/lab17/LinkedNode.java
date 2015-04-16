package lab17;

public class LinkedNode<T> {
	private T mElement;
	private LinkedNode<T> mNext;
	
	public T getElement() {
		return mElement;
	}
	
	public void setElement(T element) {
		mElement = element;
	}
	
	public LinkedNode<T> getNext() {
		return mNext;
	}
	
	public void setNext(LinkedNode<T> next) {
		mNext = next;
	}
}