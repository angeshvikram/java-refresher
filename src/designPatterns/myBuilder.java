package designPatterns;

public class myBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AADesignPatternsBuilderDemo.Builder builder  = new  AADesignPatternsBuilderDemo.Builder();
		
		builder.bread("wheat");
		
		AADesignPatternsBuilderDemo buildObj = builder.build();
		
		System.out.println(buildObj.getBread());

	}

}
