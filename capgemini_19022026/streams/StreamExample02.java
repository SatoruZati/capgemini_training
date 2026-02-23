package capgemini_19022026.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamExample02 {

    public static void main(String[] args) {

        List<EmployeeClass> empList = new ArrayList<>();

        empList.add(new EmployeeClass(
                "Lionel Messi", 80000, 36, "messi@gmail.com",
                LocalDate.of(1987, 6, 24),
                LocalDate.of(2020, 1, 10),
                "9991110001", "Argentina", "Male"
        ));

        empList.add(new EmployeeClass(
                "Cristiano Ronaldo", 90000, 39, "ronaldo@gmail.com",
                LocalDate.of(1985, 2, 5),
                LocalDate.of(2019, 3, 15),
                "9991110002", "Portugal", "Male"
        ));

        empList.add(new EmployeeClass(
                "Neymar Jr", 75000, 32, "neymar@gmail.com",
                LocalDate.of(1992, 2, 5),
                LocalDate.of(2021, 7, 1),
                "9991110003", "Brazil", "Male"
        ));

        empList.add(new EmployeeClass(
                "Kylian Mbappe", 65000, 26, "mbappe@gmail.com",
                LocalDate.of(1998, 12, 20),
                LocalDate.of(2022, 8, 10),
                "9991110004", "France", "Male"
        ));

        empList.add(new EmployeeClass(
                "Alex Morgan", 55000, 34, "alex@gmail.com",
                LocalDate.of(1989, 7, 2),
                LocalDate.of(2023, 1, 1),
                "9991110005", "USA", "Female"
        ));

        empList.add(new EmployeeClass(
                "Sergio Ramos", 60000, 37, "ramossergio@gmail.com",
                LocalDate.of(1986, 3, 30),
                LocalDate.of(2018, 5, 20),
                "9991110006", "Spain", "Male"
        ));

        empList.add(new EmployeeClass(
                "Manuel Neuer", 58000, 37, "neuer@gmail.com",
                LocalDate.of(1986, 3, 27),
                LocalDate.of(2017, 6, 15),
                "9991110007", "Germany", "Male"
        ));

        // FILTER
        System.out.println("Salary > 60000: ");
        List<EmployeeClass> filteredList = filterSalaryGreaterThan60K(empList);
        filteredList.forEach(System.out::println);
        System.out.println("------------------------------");

        // SORT by salary
        System.out.println("\nSorted by Salary: ");
        empList.stream()
                .sorted(Comparator.comparing(EmployeeClass::getSalary))
                .forEach(System.out::println);
        System.out.println("------------------------------");

        // AVERAGE salary
        double avgSalary = empList.stream()
                .mapToDouble(EmployeeClass::getSalary)
                .average()
                .orElse(0);

        System.out.println("\nAverage Salary = " + avgSalary);
        System.out.println("-----------------------------");

        // SORT BY NAME
        System.out.println("\nSorted by Name: ");
        empList.stream().sorted(Comparator.comparing(EmployeeClass::getName)).forEach(System.out::println);

        // SALARY LESS THAN EQUAL TO 60K
        // System.out.println("\nSalary <= 60000: ");
        // empList.stream().filter(employee -> employee.getSalary() <= 60000).forEach(System.out::println);

        // alternatively
        List<EmployeeClass> filteredList2 = filterSalaryLessThan60K(empList);
        System.out.println("\nSalary <= 60000: ");
        filteredList2.forEach(System.out::println);
        System.out.println("-----------------------------");

    }

    public static List<EmployeeClass> filterSalaryGreaterThan60K(List<EmployeeClass> employees) {
        return employees.stream()
                .filter(employee -> employee.getSalary() > 60000)
                .toList();
    }

    public static List<EmployeeClass> filterSalaryLessThan60K(List<EmployeeClass> employees) {
        return employees.stream()
                .filter(employee -> employee.getSalary() <= 60000)
                .toList();
    }
}
