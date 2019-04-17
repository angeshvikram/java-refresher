package problems;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Anagram {

	public static boolean isAnagram(String _str1,String _str2){
	    
	    if((_str1.isEmpty() || _str2.isEmpty()) || (_str1.length() != _str2.length())){
	      return false;
	    }
	    
	    Map <Character , Integer> anagramMap = new TreeMap<Character , Integer>();
	    
	    for (int i = 0; i < _str1.length();i++)
	    {
	      if(anagramMap.containsKey(_str1.charAt(i))){
	        anagramMap.put(_str1.charAt(i),(anagramMap.get(_str1.charAt(i))+1));
	      }
	      else{
	        anagramMap.put(_str1.charAt(i),1);
	      }
	    }

	    for (int i = 0; i < _str2.length();i++)
	    {
	      if(anagramMap.containsKey(_str2.charAt(i))){
	        if(anagramMap.get(_str2.charAt(i)) <= 0){
	          return false;
	        }
	        else{
	          anagramMap.put(_str2.charAt(i),(anagramMap.get(_str2.charAt(i))-1));
	        }
	      }
	      else{
	        return false;
	      }
	    }
	    return true;
	  }
	  
	  
	  public static void main(String[] args) {
	    ArrayList<String> strings = new ArrayList<String>();
	    strings.add("Hello, World!");
	    strings.add("Welcome to CoderPad.");
	    strings.add("This pad is running Java " + Runtime.version().feature());

	    for (String string : strings) {
	      System.out.println(string);
	    }
	    
	    System.out.println("Is it an Anagram ? Answer: "+isAnagram("CATA","CTAA"));
	  }

}
