package SingletonPattern;

public class SingletonEagerLoading {
	
	private static SingletonEagerLoading uniqueInstance = new SingletonEagerLoading();
	
	public static SingletonEagerLoading singleTonObjectGenerator() {
		
		return uniqueInstance;
		
	}

}
