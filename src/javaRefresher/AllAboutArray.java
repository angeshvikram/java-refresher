package javaRefresher;

public class AllAboutArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []iArray = new int[10];
		
		for(int i=0; i < iArray.length;i++) {
			iArray[i] = i;
		}
		
		for( int iVal:iArray) {
			System.out.println(iVal);
		}
		printArray(iArray);
		
		printArray(reverse(iArray));
	}
	
	public static void printArray(int[] array) {
		System.out.println(" From printArray");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];
		}
		return result;
	}

}
