package lab15;

public interface Stack<T> {
	public void push(T element);
	public T pop() throws EmptyCollectionException;
	public T peek() throws EmptyCollectionException;
	public Boolean isEmpty();
	public int size();
	@Override
	public String toString();
}