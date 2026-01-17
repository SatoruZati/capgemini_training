package capgemini_17012026;

public class super_call_stmt {

	public static class Animal {
		void eat() {
			System.out.println("This animal eats food");
		}
		void drink() {
			System.out.println("This animal drinks water");
		}
	}

	public static class Dog extends Animal {
		void eat() {
			super.eat(); // calling superclass method
			System.out.println("This dog eats dog food");
		}
	}

	public static void main(String[] args) {
			Dog d = new Dog();
			d.eat();
			d.drink();
		}

}

// super call statement should be the first statement in the constructor

