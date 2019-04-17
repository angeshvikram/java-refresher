package designPatterns;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
	protected List<Page> pages= new ArrayList<>();
	
	public List<Page> getPages() {
		return pages;
	}

	public Website () {
		this.createwebsite();
	}

	protected abstract void createwebsite();

}
