package designPatterns;

public class mySinglton {
	
	private static volatile mySinglton instance  = null;
	
	private mySinglton() {
		if(instance != null) {
			throw new RuntimeException("use getInstance to create");
		}
	}
	
	public static mySinglton getInstance () {
		
		if (instance == null) {
			
			synchronized (mySinglton.class) {
				if(instance == null) {
					instance  = new mySinglton();
				}
			}
		}
		return instance;
	}

}
