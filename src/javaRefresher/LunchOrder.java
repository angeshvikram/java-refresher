package javaRefresher;

import designPatterns.AADesignPatternsBuilderDemo.Builder;

public class LunchOrder {
	
	
	public static class Builder{
		private String bread;
		private String type;
		
		public Builder() {
			
		}
		
		public LunchOrder build() {
			return new LunchOrder(this);
		}
		
		public Builder bread (String str) {
			this.bread = str;
			return this;
		}
		public Builder type (String str) {
			this.type = str;
			return this;
		}
		
	}
	
	private final String bread;
	private final String type;
	
	private LunchOrder(Builder build) {
		this.bread = build.bread;
		this.type = build.type;
	}
	public String getBread() {
		return bread;
	}
	public String getType() {
		return type;
	}

}
