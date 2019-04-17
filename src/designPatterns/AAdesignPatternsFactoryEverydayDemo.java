package designPatterns;

import java.util.Calendar;

public class AAdesignPatternsFactoryEverydayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Library  Calendar;
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));

		
		// Website;
		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		
		System.out.println(cal);
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(site);

	}

}
