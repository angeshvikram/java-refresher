package designPatterns;

public class myBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		builderDemo.Builder builder  = new  builderDemo.Builder();
		
		builder.bread("wheat");
		
		builderDemo buildObj = builder.build();
		
		System.out.println(buildObj.getBread());

	}

}
