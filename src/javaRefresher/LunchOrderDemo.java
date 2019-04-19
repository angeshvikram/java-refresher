package javaRefresher;

public class LunchOrderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LunchOrder.Builder loBuilder  = new  LunchOrder.Builder();
		
		loBuilder.bread("Wheat").type("Veg");
		
		LunchOrder  lo =  loBuilder.build();
		
		System.out.println(lo.getBread());
		System.out.println(lo.getType());
		
		
		

	}

}
