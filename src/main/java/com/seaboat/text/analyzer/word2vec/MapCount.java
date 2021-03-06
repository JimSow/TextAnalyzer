package com.seaboat.text.analyzer.word2vec;

/**
 * 
 * @author from https://github.com/NLPchina
 * @date 2018-06-11
 * @version 1.0
 * <pre><b>email: </b>849586227@qq.com</pre>
 * <pre><b>blog: </b>http://blog.csdn.net/wangyangzhizhou</pre>
 * <p>map count.</p>
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapCount<T> {
	private HashMap<T, Integer> hm = null;

	public MapCount() {
		this.hm = new HashMap<T, Integer>();
	}

	public MapCount(int initialCapacity) {
		this.hm = new HashMap<T, Integer>(initialCapacity);
	}

	public void add(T t, int n) {
		Integer integer = null;
		if ((integer = (Integer) this.hm.get(t)) != null) {
			this.hm.put(t, Integer.valueOf(integer.intValue() + n));
		} else {
			this.hm.put(t, Integer.valueOf(n));
		}

	}

	public void add(T t) {
		this.add(t, 1);
	}

	public int size() {
		return this.hm.size();
	}

	public void remove(T t) {
		this.hm.remove(t);
	}

	public HashMap<T, Integer> get() {
		return this.hm;
	}

	public String getDic() {
		Iterator<?> iterator = this.hm.entrySet().iterator();
		StringBuilder sb = new StringBuilder();
		Entry<?, ?> next = null;

		while (iterator.hasNext()) {
			next = (Entry<?, ?>) iterator.next();
			sb.append(next.getKey());
			sb.append("\t");
			sb.append(next.getValue());
			sb.append("\n");
		}

		return sb.toString();
	}

}
