package capgemini_15012026;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Overriding toString() method
	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + "}";
	}
}

public class strings {

	public static void main(String[] args) {
		// testing variable address
		strings obj1 = new strings();
		System.out.println(obj1); // prints the object's memory address in hashcode format
		// Output: capgemini_15012026.strings@15db9742 (one time output, other times hashcode may vary)

		// testing toString() method
		Integer numv [] = {10,20,30,40,50};
		String str = numv.toString();
		System.out.println(str); // prints the string representation of the array object
		// Output: [Ljava.lang.Integer;@6d06d69c (one time output, other times hashcode may vary)
		// this gives the type and hashcode of the array object

		String str1 = "Hello";
		System.out.println(str1.toString()); // prints the same string
		// Output: Hello

		// manually overriding toString() method
		Person p = new Person("John", 25);
		System.out.println(p.toString()); // prints the overridden string representation of the Person object

		// String Builder example
		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.append(" World");
		System.out.println("StringBuilder after append: " + sb1.toString()); 
		// prints: StringBuilder after append: Hello World

		// String Buffer: It is similar to String Builder but is synchronized and thread-safe
		StringBuffer sbf = new StringBuffer("Capgemini");
		sbf.append(" Training");
		System.out.println("StringBuffer after append: " + sbf.toString());
		// prints: StringBuffer after append: Capgemini Training


		// String Buffer memory capacity
		StringBuffer sb = new StringBuffer();
		System.out.println("Default capacity of StringBuffer: " + sb.capacity()); 
		// prints: Default capacity of StringBuffer: 16
		sb.append("Appending some text to check capacity.");
		System.out.println("Capacity of StringBuffer after append: " + sb.capacity());
		// prints: Capacity of StringBuffer after append: 47

		// String Buffer reverse() method
		StringBuffer strBuf = new StringBuffer("Hello World");
		strBuf.reverse();
		System.out.println("Reversed StringBuffer: " + strBuf.toString());
		// prints: Reversed StringBuffer: dlroW olleH

		///////////////////////////////////////////////////////////////////////
		// String Builder vs String Buffer performance
		long startTime, endTime;
		// String Builder performance test
		StringBuilder stringBuilder = new StringBuilder();
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			stringBuilder.append("A");
		}	
		endTime = System.nanoTime();
		System.out.println("StringBuilder time taken: " + (endTime - startTime) + " ns");
		// String Buffer performance test
		StringBuffer stringBuffer = new StringBuffer();
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			stringBuffer.append("A");
		}
		endTime = System.nanoTime();
		System.out.println("StringBuffer time taken: " + (endTime - startTime) + " ns");
		// Generally, StringBuilder is faster than StringBuffer due to the lack of synchronization overhead
		// output: 	StringBuilder time taken: 998400 ns
		// 			StringBuffer time taken: 542500 ns

	}

}
