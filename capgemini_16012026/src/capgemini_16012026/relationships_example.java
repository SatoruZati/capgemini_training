package capgemini_16012026; 
// Package declaration groups related classes and avoids name conflicts

import java.util.ArrayList;
import java.util.List;
// Imported to support Aggregation (Owner has multiple Car objects)

/*
 * CLASS: RelationshipsExample
 * ---------------------------
 * This class demonstrates all major Object-Oriented Relationships in Java:
 * 1. Composition
 * 2. Association
 * 3. Aggregation
 * 4. Inheritance
 *
 * All inner classes are declared STATIC so that:
 * - They do NOT depend on an enclosing instance
 * - They can be created inside the static main() method
 */
public class relationships_example {

    /* =========================================================
     * COMPOSITION (Strong "HAS-A" Relationship)
     * =========================================================
     * Car HAS-A Engine
     * - Engine is a mandatory part of Car
     * - Without Engine, Car cannot function
     */
    static class Car {

        // Engine reference stored inside Car
        // Composition implies ownership
        private Engine engine;

        // Setter method injects Engine dependency into Car
        public void setEngine(Engine engine) {
            this.engine = engine;
            // 'this.engine' refers to the instance variable
            // 'engine' refers to the parameter
        }

        // Method to start the car
        public void start() {

            // Defensive check to avoid NullPointerException
            if (engine != null) {

                // Delegates responsibility to Engine
                engine.ignite();

                System.out.println("Koenigsegg Twin Turbo V8 Engine started.");
            } else {
                // Executes if Engine was not set
                System.out.println("No engine found. Cannot start the car.");
            }
        }
    }

    /* =========================================================
     * ASSOCIATION (Weak "USES-A" Relationship)
     * =========================================================
     * Driver USES Car
     * - Driver and Car can exist independently
     * - Relationship exists only during method execution
     */
    static class Driver {

        // Method receives Car as a parameter
        // No ownership is established
        public void drive(Car car) {

            System.out.println("Max Verstappen is driving the car.");

            // Driver uses Car's functionality
            car.start();
        }
    }

    /* =========================================================
     * AGGREGATION (Whole-Part Relationship)
     * =========================================================
     * Owner HAS multiple Cars
     * - Cars can exist without Owner
     * - Owner only references existing Car objects
     */
    static class Owner {

        // Collection holds multiple Car objects
        private List<Car> cars;

        // Constructor initializes the collection
        public Owner() {
            cars = new ArrayList<>();
        }

        // Adds a Car to Owner's list
        public void addCar(Car car) {
            cars.add(car);
            System.out.println("Car added to owner's collection.");
        }
    }

    /* =========================================================
     * SUPPORTING CLASSES
     * ========================================================= */

    // Engine provides functionality to Car
    static class Engine {

        // Engine behavior
        public void ignite() {
            System.out.println("Engine is ignited.");
            System.out.println("Launch Mode Activated!");
        }
    }

    // Brand represents identity of the vehicle
    static class Brand {

        private String name;

        // Constructor initializes brand name
        public Brand() {
            this.name = "Pagani";
        }

        // Getter method (Encapsulation)
        public String getName() {
            return name;
        }
    }

    // Price class represents cost of the car
    static class Price {

        private double amount;

        // Constructor assigns a fixed price
        public Price() {
            this.amount = 200000000.00;
        }

        // Getter to access price
        public double getAmount() {
            return amount;
        }
    }

    /* =========================================================
     * INHERITANCE ("IS-A" Relationship)
     * =========================================================
     * SportsCar IS-A Car
     * - Inherits all properties and behavior of Car
     * - Overrides behavior where required
     */
    static class SportsCar extends Car {

        // SportsCar has its own Brand
        private Brand brand;

        // Constructor initializes Brand
        public SportsCar() {
            this.brand = new Brand();
        }

        // Overridden method provides specialized behavior
        @Override
        public void start() {

            // Custom behavior before calling parent method
            System.out.println("Starting the sports car: "
                    + brand.getName() + " Utopia");

            // Calls parent class implementation
            super.start();
        }
    }

    /* =========================================================
     * MAIN METHOD (Execution Entry Point)
     * ========================================================= */
    public static void main(String[] args) {

        // -------- COMPOSITION --------
        // Creating Car and Engine separately
        Car car = new Car();
        Engine engine = new Engine();

        // Injecting Engine into Car
        car.setEngine(engine);

        // Starting the Car
        car.start();

        // -------- ASSOCIATION --------
        Driver driver = new Driver();

        // Driver uses Car temporarily
        driver.drive(car);

        // -------- AGGREGATION --------
        Owner owner = new Owner();

        // Owner aggregates existing Car
        owner.addCar(car);

        // -------- INHERITANCE --------
        SportsCar sportsCar = new SportsCar();

        // SportsCar also requires Engine (inherited behavior)
        sportsCar.setEngine(engine);

        // Calls overridden start() method
        sportsCar.start();
    }
}
