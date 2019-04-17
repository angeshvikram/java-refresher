package designPatterns;

public class Shopping extends Website {

	@Override
	protected void createwebsite() {
		// TODO Auto-generated method stub
		pages.add(new Home());
		pages.add(new CartPage());
		pages.add(new CartPage());
		pages.add(new AboutPage());
		pages.add(new ContactUs());
	}

}
