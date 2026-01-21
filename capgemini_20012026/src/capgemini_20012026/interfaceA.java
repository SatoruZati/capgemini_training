package capgemini_20012026;

public interface interfaceA {
	// interface method
	void methodA();
	
	static void methodStaticA() {
		System.out.println("Static method in interfaceA");
	}
	
	default void defaultMethodA() {
		System.out.println("Default method in interfaceA");
	}
	
	static final int CONSTANT_A = 100;
	
	void commonMethod();
	
}
