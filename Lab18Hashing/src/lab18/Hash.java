package lab18;

public interface Hash<K, V>{
	public void put(K key, V value);
	public V get(K key);
	public int size();
}