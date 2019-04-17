package designPatterns;

public class AADesignPatternsSingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mySinglton sObj = mySinglton.getInstance();
		
		System.out.println(sObj);
		
		mySinglton sObj2 = mySinglton.getInstance();
		
		System.out.println(sObj2);

	}

}
