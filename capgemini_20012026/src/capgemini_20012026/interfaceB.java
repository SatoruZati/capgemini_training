package capgemini_20012026;

// interfaceB extending interfaceA

public interface interfaceB extends interfaceA {
	// interface method
	void methodB();
	
	static void methodStaticB() {
		System.out.println("Static method in interfaceB");
	}
	
	default void defaultMethodB() {
		System.out.println("Default method in interfaceB");
	}
	
	static final int CONSTANT_B = 200;
	
	void commonMethod();
	
}
