package lab17;

public class CircularArrayQueue<T> implements Queue<T> {
	private final static int DEFAULT_CAPACITY =100;
	private int mFront, mRear, mCount = 0;
	private T[] mQueue;
	
	@SuppressWarnings("unchecked")
	public CircularArrayQueue(int initialCapacity) {
		mFront = mRear = mCount = 0;
		mQueue = (T[]) (new Object[initialCapacity]);
	}
	
	public CircularArrayQueue() {
		this(DEFAULT_CAPACITY);
	}
	
	@Override
	public void enqueue(T element) {
		if(size() == mQueue.length){
			throw new UnsupportedOperationException("Array is out of space!");
		}
		
		mQueue[mRear] = element;
		mRear = (mRear + 1) % mQueue.length;
		mCount++;
	}
	@Override
	public T dequeue() throws EmptyCollectionException {
		EmptyCollectionException ece = new EmptyCollectionException("Array is empty!");
		if(mQueue[mFront] == null){
			throw ece;
		}
		T toReturn;
		toReturn = mQueue[mFront];
		mQueue[mFront] = null;
		mFront = (mFront + 1) % mQueue.length;
		mCount--;
		return toReturn;
	}
	@Override
	public T first() {
		return mQueue[mFront];
	}
	@Override
	public boolean isEmpty() {
		if(mQueue[mFront] == null){
			return true;
		}
		else{
		return false;
		}
	}
	@Override
	public int size() {
		return mCount;
	}
	
	
}