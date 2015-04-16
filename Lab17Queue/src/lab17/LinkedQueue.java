package lab17;

public class LinkedQueue<T> implements Queue <T>{

	private int mCount;
	private LinkedNode<T> mHead, mTail;
	
	@Override
	public void enqueue(T element) {
		LinkedNode<T> node = new LinkedNode<T>();
		
		node.setElement(element);
		
		if (mHead == null){
			mHead = node;
		} else {
			mTail.setNext(node);
		}
		
		mTail = node;
		mCount++;
	}

	@Override
	public T dequeue() throws EmptyCollectionException{
		EmptyCollectionException ece = new EmptyCollectionException("Queue is empty!");
		if(mHead == null){
			throw ece;
		}
		T toReturn;
		toReturn = mHead.getElement();
		if(mHead == mTail){
			mHead = null;
		}else{
			mHead = mHead.getNext();
		}
		mCount--;
		return toReturn;
	}

	@Override
	public T first() {
		return mHead.getElement();
	}

	@Override
	public boolean isEmpty() {
		if(mHead == null){
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