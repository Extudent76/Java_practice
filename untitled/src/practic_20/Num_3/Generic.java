package practic_20.Num_3;

import java.io.Serializable;

public class Generic <T extends Comparable, V extends Animal & Serializable, K> {
	private T t;
	private V v;
	private K k;

	public Generic(T t, V v, K k) {
		this.t = t;
		this.v = v;
		this.k = k;
	}

	public T getT() {
		return t;
	}

	public V getV() {
		return v;
	}

	public K getK() {
		return k;
	}

	@Override
	public String toString() {
		return "Generic{" +
				"T=" + t +
				", V=" + v +
				", K=" + k +
				'}';
	}
}
