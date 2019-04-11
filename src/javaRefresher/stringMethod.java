package javaRefresher;

public class stringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "This is the test string";
		
		String str2 = "Helo";
		String str3 = "Helo";
		String str5 = "H";
		String str4 = "World";
		String str6 = "";
		String str7 = "Some spaces            ";
		
		System.out.println(str1.length());
		System.out.println(str1.charAt(2));
		System.out.println(str1.concat(" This is the appended string"));
		System.out.println(str1.contains("This"));
		System.out.println(str1.contains("there"));
		System.out.println(str1.startsWith("the"));
		System.out.println(str1.startsWith("This"));
		System.out.println(str1.startsWith("this"));
		System.out.println(str1.endsWith("string"));
		System.out.println(str1.endsWith("strin"));
		System.out.println(str2.compareTo(str3));
		System.out.println(str2.compareTo(str4));
		System.out.println(str2.compareTo(str5));
		System.out.println(str2.equals(str3));
		System.out.println(str2.equals(str4));
		
		
		System.out.println(str1.indexOf("hi"));
		System.out.println(str5.isEmpty());
		System.out.println(str6.isEmpty());
		
		System.out.println(str7.trim());
		
		System.out.println(str7.replace('e', 'a'));
		
		System.out.println("Sub string is :"+str1.substring(5));
		System.out.println("Sub string is :"+str1.substring(5,10));
		
		char [] charAry = str1.toCharArray();
		
		for (int i=0;i<charAry.length;i++) {
			System.out.println(charAry[i]);
		}
		
		System.out.println(str2.toLowerCase());
		System.out.println(str2.toUpperCase());
		
		
		String strD ="28/12/2013/33";
		
		String []strA = strD.split("/");
		String []strB = strD.split("/", 3);
		
		for (String temp:strA) {
			System.out.println(temp);
		}
		for (String temp:strB) {
			System.out.println(temp);
		}
				

	}

}
