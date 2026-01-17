package example2;
import example01.package1example;


public class example2package {

    public static void main(String[] args) {
        // create an object of the class from example01 package
        package1example obj = new package1example();
		obj.exampleconstructor();
		System.out.println("\n");
		// here we are importing package 01 into package 02
		// so we can access its methods and properties
		// we imported package01 at the top of this file and created its object here
		// then we called its method example constructor using that object

		obj.examplemethod();
		System.out.println("\n");

        System.out.println("This is Package 02 importing Package 01");
    }

}

