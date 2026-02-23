/*

public class Employee {
    private int id;
    private String name;
    private String department;
    private String jobTitle;
    private int age;
    private int yearsOfExperience;
    private double salary;
    private int performanceRating;
}

Task 1:
Implement a program that reads a list of Employee objects from the user and performs the following operations:
Filter out all employees who are managers and have a salary greater than 100,000, but have joined in the last 3 years.
Sort the remaining employees in descending order of their years of experience, and then by their performance ratings in ascending order.
Return a new list containing the names of the remaining employees, but with each name reversed and in uppercase.

Task 2:
Create a program that takes a list of Employee objects as input and performs the following operations:
Filter out all employees who have joined in the last 5 years and have a performance rating of less than 8, but have a salary between 60,000 and 120,000.
Sort the remaining employees in ascending order of their salaries, and then by their years of experience in descending order.
Return a new list containing the IDs of the remaining employees, but with each ID multiplied by 10.

 */
package capgemini_19022026.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeSample {

    public static void main(String[] args) {
        task1();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        task2();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public static void task1() {

        // Create data source (List is better than Stream for multi-step processing)
        List<Employee> employees = List.of(
                new Employee(101, "Ivan Rakitic", "IT", "Manager", 35, 10, 120000, 9),
                new Employee(102, "Luka Modric", "HR", "Executive", 30, 5, 90000, 7),
                new Employee(103, "Sergio Ramos", "Finance", "Manager", 40, 15, 150000, 8),
                new Employee(104, "Gerard Pique", "IT", "Developer", 28, 3, 80000, 6),
                new Employee(105, "Iker Casillas", "HR", "Manager", 38, 12, 110000, 9),
                new Employee(106, "Marcelo Vieira", "Finance", "Executive", 32, 7, 95000, 7),
                new Employee(107, "Dani Alves", "IT", "Developer", 29, 4, 85000, 6),
                new Employee(108, "Xabi Alonso", "HR", "Manager", 36, 11, 130000, 8),
                new Employee(109, "Carles Puyol", "Finance", "Executive", 33, 8, 100000, 7),
                new Employee(110, "Andres Iniesta", "IT", "Developer", 31, 6, 90000, 7),
                new Employee(111, "Thiago Alcantara", "HR", "Manager", 34, 9, 115000, 8),
                new Employee(112, "David Villa", "Finance", "Executive", 37, 13, 105000, 7),
                new Employee(113, "Fernando Torres", "IT", "Developer", 27, 2, 75000, 5),
                new Employee(114, "Dani Carvajal", "HR", "Manager", 39, 14, 125000, 9)
        );

        System.out.println("Original Data:");
        employees.forEach(System.out::println);

        System.out.println("---------------------");


    /*
    STEP 1: FILTER
    Remove employees who:
        - are Managers
        - salary > 100000
        - experience < 3
    */

        List<Employee> filteredList =
                employees.stream()
                        .filter(emp ->
                                !(emp.getJobTitle().equals("Manager")
                                        && emp.getSalary() > 100000
                                        && emp.getYearsOfExperience() < 3)
                        )
                        .toList();

        System.out.println("After Filtering:");
        filteredList.forEach(System.out::println);

        System.out.println("---------------------");


    /*
    STEP 2: SORT
    - Experience DESC
    - Performance ASC
    */

        List<Employee> sortedList =
                filteredList.stream()
                        .sorted(
                                Comparator.comparing(Employee::getYearsOfExperience)
                                        .reversed()
                                        .thenComparing(Employee::getPerformanceRating)
                        )
                        .toList();

        System.out.println("After Sorting:");
        sortedList.forEach(System.out::println);

        System.out.println("---------------------");


    /*
    STEP 3: MAP
    Reverse + Uppercase
    */

        List<String> resultNames =
                sortedList.stream()
                        .map(emp ->
                                new StringBuilder(emp.getName())
                                        .reverse()
                                        .toString()
                                        .toUpperCase()
                        )
                        .toList();

        System.out.println("Final Names (Reversed + Uppercase):");
        resultNames.forEach(System.out::println);

        System.out.println("---------------------");
    }

    public static void task2() {

        List<Employee> employees = List.of(
                new Employee(101, "Ivan Rakitic", "IT", "Manager", 35, 10, 120000, 9),
                new Employee(102, "Luka Modric", "HR", "Executive", 30, 5, 90000, 7),
                new Employee(103, "Sergio Ramos", "Finance", "Manager", 40, 15, 150000, 8),
                new Employee(104, "Gerard Pique", "IT", "Developer", 28, 3, 80000, 6),
                new Employee(105, "Iker Casillas", "HR", "Manager", 38, 12, 110000, 9),
                new Employee(106, "Marcelo Vieira", "Finance", "Executive", 32, 7, 95000, 7),
                new Employee(107, "Dani Alves", "IT", "Developer", 29, 4, 85000, 6),
                new Employee(108, "Xabi Alonso", "HR", "Manager", 36, 11, 130000, 8),
                new Employee(109, "Carles Puyol", "Finance", "Executive", 33, 8, 100000, 7),
                new Employee(110, "Andres Iniesta", "IT", "Developer", 31, 6, 90000, 7),
                new Employee(111, "Thiago Alcantara", "HR", "Manager", 34, 9, 115000, 8),
                new Employee(112, "David Villa", "Finance", "Executive", 37, 13, 105000, 7),
                new Employee(113, "Fernando Torres", "IT", "Developer", 27, 2, 75000, 5),
                new Employee(114, "Dani Carvajal", "HR", "Manager", 39, 14, 125000, 9)
        );

        System.out.println("Original Data:");
        employees.forEach(System.out::println);
        System.out.println("---------------------");



    /*
    STEP 1: FILTER
    Remove employees who:
        - experience < 5
        - performance < 8
        - salary between 60000 and 120000
    */

        List<Employee> filtered =
                employees.stream()
                        .filter(emp ->
                                !(emp.getYearsOfExperience() < 5 &&
                                        emp.getPerformanceRating() < 8 &&
                                        emp.getSalary() >= 60000 &&
                                        emp.getSalary() <= 120000)
                        )
                        .toList();

        System.out.println("After Filtering:");
        filtered.forEach(System.out::println);
        System.out.println("---------------------");



    /*
    STEP 2: SORT
    Salary ASC
    Experience DESC
    */

        List<Employee> sorted =
                filtered.stream()
                        .sorted(
                                Comparator.comparing(Employee::getSalary)
                                        .thenComparing(
                                                Comparator.comparing(Employee::getYearsOfExperience)
                                                        .reversed()
                                        )
                        )
                        .toList();

        System.out.println("After Sorting:");
        sorted.forEach(System.out::println);
        System.out.println("---------------------");



    /*
    STEP 3: MAP
    Return ID * 10
    */

        List<Integer> resultIds =
                sorted.stream()
                        .map(emp -> emp.getId() * 10)
                        .toList();

        System.out.println("Final IDs (ID * 10):");
        resultIds.forEach(System.out::println);
        System.out.println("---------------------");
    }



}
