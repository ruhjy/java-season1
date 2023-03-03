package ch13_1.exercise.exam03;

public class Container<K, V> {

	private K k;
	private V v;

	public K getKey() {
		return k;
	}

	public V getValue() {
		return v;
	}

	public void set(K k, V v) {
		this.k = k;
		this.v = v;
	}


}
