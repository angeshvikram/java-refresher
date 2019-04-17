package javaRefresher;

import java.util.LinkedHashMap;
import java.util.Map;

public class LFU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
	class LFUCache {
	    
	    Map<Integer, Integer> lfuCache = null;
	    int lfuCapacity = 0;

	    public LFUCache(int capacity) {
	        this.lfuCapacity = capacity;
	        this.lfuCache = new LinkedHashMap<Integer, Integer>();
	    }
	    
	    public int get(int key) {

	        if(this.lfuCache.containsKey(key)){
	            this.lfuCache.put(key,(this.lfuCache.get(key)+1));
	            
	            return key;
	        }
            if(this.lfuCache.size() >= this.lfuCapacity){
	            removeLeastUsedMember();
	        }
            this.lfuCache.put(key,(this.lfuCache.get(key)+1));
	        return -1;
	    }
	    
	    public void removeLeastUsedMember(){
	        Integer min = -1;
	        Integer key = -1;
	        for(Integer keyVal:this.lfuCache.keySet()){
	            if(min == -1){
	                min = this.lfuCache.get(keyVal);
	                key = keyVal;
	            }
	            if(min > this.lfuCache.get(keyVal)){
	                key = keyVal;
	                min = this.lfuCache.get(keyVal);
	            }
	        }
	        this.lfuCache.remove(key);
	    }
	    
	    public void put(int key, int value) {
	        if(this.lfuCache.size() >= this.lfuCapacity){
	            removeLeastUsedMember();
	        }
	        this.lfuCache.put(key,value);
	    }
	}

	/**
	 * Your LFUCache object will be instantiated and called as such:
	 * LFUCache obj = new LFUCache(capacity);
	 * int param_1 = obj.get(key);
	 * obj.put(key,value);
	 */

}
