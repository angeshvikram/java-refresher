package com.sample.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlatMap {

	public static void main(String[] args) {
		Map<String, Map<String, ?>> map_m_A = new HashMap<>();
		Map<String, Map<String, ?>> map_m_B = new HashMap<>();
		Map<String, String> map_str = new HashMap<>();
		
		map_m_A.put("A", map_m_B);
		map_m_B.put("B", map_str);
		map_str.put("C", "C1");
		map_str.put("D", "D1");
		
		System.out.println("map_m_1: " + map_m_A);
		
//		Map<String, String> resultMap = flat(map_m_1, "");
		List<String> resultList = flat(map_m_A, "");
		System.out.println("resultList: " + resultList);
	}
	
	@SuppressWarnings("unchecked")
	public static List<String> flat(Map<String, ?> map, String keyPrefix) {
		List<String> resultList = new ArrayList<>();
		for(String key : map.keySet()) {
			if(map.get(key) instanceof String) {
				String resultValue = keyPrefix + "_" + key + ": " + (String)map.get(key);
				resultList.add(resultValue);
			} else {
				if(keyPrefix.length() > 0) {
					keyPrefix = keyPrefix + "_";
				}
				List<String> convertedList = flat((Map<String, Map<String, ?>>) map.get(key), keyPrefix + key );
				for(String convertedValue : convertedList) {
					resultList.add(convertedValue);
				}
			}
		}
		return resultList;
	}
	
//	@SuppressWarnings("unchecked")
//	public Map<String, String> flat(Map<String, ?> map) {
//		Map<String, String> result = new HashMap<>();
//		for(String key : map.keySet()) {
//			String keyPrefix = key + "_";
//			if(map.get(key) instanceof String) {
//				result.put(keyPrefix, (String)map.get(key));
//			} else {
//				flat((Map<String, ?>) map.get(key), keyPrefix);
//			}
//		}
//		return result;
//	}
	
//	@SuppressWarnings("unchecked")
//	public static Map<String, String> flat(Map<String, ?> map, String keyPrefix) {
//		Map<String, String> resultMap = new HashMap<>();
//		for(String key : map.keySet()) {
//			if(map.get(key) instanceof String) {
//				resultMap.put(keyPrefix + "_" + key, (String)map.get(key));
//			} else {
//				Map<String, String> convertedMap = flat((Map<String, Map<String, ?>>) map.get(key), keyPrefix + "_" + key );
//				for(String convertedMapKey : convertedMap.keySet()) {
//					resultMap.put(convertedMapKey, convertedMap.get(convertedMapKey));
//				}
//			}
//		}
//		return resultMap;
//	}

}
