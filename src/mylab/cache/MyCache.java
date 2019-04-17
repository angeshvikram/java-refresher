package mylab.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyCache {

	private Map<String, Integer> cache;
	private Map<Integer, Set<String>> keyCache;
	
	public MyCache() {
		cache = new HashMap<>();
		keyCache = new HashMap<>();
	}
	
	// GET
	public Integer get(String key) {
		return cache.get(key);
	}
	
	// SET
	public void set(String key, Integer value) {
		cache.put(key, value);
		
		//TODO: clean value in keyCache.
	}
	
	// INCR
	public void incr(String key) {
		Integer value = cache.get(key);
		if(value == null) {
			value = 0;
		}
		value++;
		cache.put(key, value);
		
		//TODO: clean value in keyCache.
	}
	
	// DEL
	public void del(String key) {
		Integer value = cache.get(key);
		if(value != null) {
			cache.remove(key);
			
			// TODO: clean value in keycache
		}
	}
	
	// DELVALUE
	public void delValue() {
		
	}
	
	// MULTI
	public void multi() {
		
	}
	
	// EXEC
	public void exec() {
		
	}
	
	// DISCARDSOFTWARE
	public void discard() {
		
	}
}

class MyCacheTest {
	public static void main(String[] args) {
		MyCache myCache = new MyCache();
		
//		myCache.set(key, value);
	}
}