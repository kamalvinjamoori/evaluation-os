package SingletonPattern;

public class Main {
	
	public static void main(String[] args) {
		
		SingletonEagerLoading a1 = SingletonEagerLoading.singleTonObjectGenerator();
		SingletonEagerLoading a2 = SingletonEagerLoading.singleTonObjectGenerator();
		
		SingletonLazyLoading s1 = SingletonLazyLoading.getUniqueInLazyLoading();
		SingletonLazyLoading s2 = SingletonLazyLoading.getUniqueInLazyLoading();
		
		
		System.out.println(a1==a2);
		System.out.println(s1 == s2);
		
	}

}
