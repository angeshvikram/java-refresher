package designPatterns;

public class WebsiteFactory {
	
	public static Website  getWebsite(WebsiteType _siteType) {
		
		switch (_siteType) {
			case BLOG:{
				return new Blog ();
			}
			case SHOP:{
				return new Shopping ();
			}
			default:{
				return null;
			}
		}
	}
}
