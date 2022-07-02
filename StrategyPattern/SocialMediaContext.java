package StrategyPattern;

public class SocialMediaContext {
	
	private Strategy strategy;
	
	public void setSocialmediaStrategy(Strategy strategy) {
		
		this.strategy = strategy;
	}
	
	public void connect(String name) {
		
		strategy.socialMediaStrategy(name);
	}
	
}
