package lab17;

public interface Queue<T> {
	public void enqueue(T element);
	public T dequeue() throws EmptyCollectionException;
	public T first();
	public boolean isEmpty();
	public int size();
}