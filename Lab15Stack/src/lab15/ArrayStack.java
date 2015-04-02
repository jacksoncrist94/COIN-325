package lab15;

public class ArrayStack<T> implements Stack<T>{
	private final int DEFAULT_CAPACITY = 10;
	private T[] mArray;
	private int mPosition;
	
	@SuppressWarnings("unchecked")
	public ArrayStack(){
		mArray = (T[]) (new Object[DEFAULT_CAPACITY]);
		mPosition = 0;
	}

	@Override
	public void push(T element) {
		if (mPosition == mArray.length) {
			expandCapacity();
		}
		
		mArray[mPosition] = element;
		mPosition++;
	}
	
	@SuppressWarnings("unchecked")
	private void expandCapacity() {
		T[] array = (T[]) (new Object[mArray.length*2]);
		
		for (int i = 0; i < array.length; i++) {
			array[i] =  mArray[i];
		}
		mArray = array;
	}

	@Override
	public T pop() throws EmptyCollectionException {
		if(mArray[0] == null){
			throw new EmptyCollectionException("The collection is empty");
		}
		else{
			T mPop;
			mPosition--;
			mPop = mArray[mPosition];
			mArray[mPosition] = null;
			return mPop;
		}
	}

	@Override
	public T peek() throws EmptyCollectionException {
		if(mArray[0] == null){
			throw new EmptyCollectionException("The collection is empty.");
		}
		else{
			return mArray[(mPosition - 1)];
		}
	}

	@Override
	public Boolean isEmpty() {
		if(mArray[0] == null){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public int size() {
		int pos = 0;
		int size = 0;
		while(mArray[pos] != null){
			pos++;
			size++;
		}
		return size;
	}
	
}