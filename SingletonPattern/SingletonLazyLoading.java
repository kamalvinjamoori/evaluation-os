package SingletonPattern;

public class SingletonLazyLoading {
	
	private static volatile SingletonLazyLoading uniqueinstance;
	
	public static synchronized SingletonLazyLoading getUniqueInLazyLoading() {
		
		if(uniqueinstance==null)
				uniqueinstance = new SingletonLazyLoading();
		
		return uniqueinstance;
		
	}

}
