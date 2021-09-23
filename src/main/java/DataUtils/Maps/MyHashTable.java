package DataUtils.Maps;

import java.util.*;

public class MyHashTable<K, V> implements Map {
	private Hashtable<K,V> map;

	public <V, K> MyHashTable()
	{
		map = new Hashtable<>();
	}

	@Override
	public int size() {
		int keyCount = 0;
		for (Iterator<K> it = map.keys().asIterator(); it.hasNext(); ) {
			keyCount++;
			K k = it.next();
		}
		return keyCount;
	}

	@Override
	public boolean isEmpty() {
		return (this.size() == 0);
	}

	@Override
	public boolean containsKey(Object key) {
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		return false;
	}

	@Override
	public Object get(Object key) {
		return null;
	}

	@Override
	public Object put(Object key, Object value) {
		return null;
	}

	@Override
	public Object remove(Object key) {
		return null;
	}

	@Override
	public void putAll(Map m) {

	}

	@Override
	public void clear() {

	}

	@Override
	public Set keySet() {
		return null;
	}

	@Override
	public Collection values() {
		return null;
	}

	@Override
	public Set<Entry> entrySet() {
		return null;
	}
}
