package lab18;

import java.util.LinkedList;

public class HashLinkedChaining<K, V> implements Hash<K, V>{

	private Object[] mTable;
	private int mSize;
	
	HashLinkedChaining(){
		mTable = (new Object[2]);
		for (int i = 0; i< mTable.length; i++) {
			mTable[i] = new LinkedList<HashNode<K, V>>();
			
		}
	}
	
	
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void put(K key, V value) {
		if (key == null || value == null){
			return;
		}
		
		LinkedList<HashNode<K, V>> list = (LinkedList<HashNode<K, V>>)
				mTable[Math.abs(key.hashCode()) % mTable.length];
		
		list.add(new HashNode(key, value));
		mSize++;
	}

	@SuppressWarnings("unchecked")
	@Override
	public V get(K key) {
		V ret;
		
		int index = 0;
		
		if (key == null) {
			return null;
		}
		
		LinkedList<HashNode<K, V>> list = (LinkedList<HashNode<K, V>>)
				mTable[Math.abs(key.hashCode()) % mTable.length];
		
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getKey().equals(key)){
				index = i;
				
			}
				
				
		}
		
		ret = list.get(index).getValue();
		
		return ret;
		
	}

	@Override
	public int size() {
		return mSize;
	}
	
	
	
}