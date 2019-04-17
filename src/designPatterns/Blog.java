package designPatterns;

public class Blog extends Website {

	@Override
	protected void createwebsite() {
		// TODO Auto-generated method stub
		
		pages.add(new Home());
		pages.add(new CommentPage());
		pages.add(new AboutPage());
		pages.add(new ContactUs());
		pages.add(new PostPage());
	}

}
