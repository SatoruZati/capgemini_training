package com.example.Spring_Framework.App;

import com.example.Spring_Framework.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        // Load the Spring bean configuration XML
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");

        // Constructor Injection bean (only employeeID set)
        Employee emp2 = (Employee) context.getBean("employee2");
        System.out.println("Constructor Injection  -> " + emp2);

        // Setter Injection beans
        Employee emp = (Employee) context.getBean("employee");
        System.out.println("Setter Injection (1)   -> " + emp);

        Employee emp1 = (Employee) context.getBean("employee1");
        System.out.println("Setter Injection (2)   -> " + emp1);

        // p-namespace Setter Injection
        Employee emp3 = (Employee) context.getBean("employee3");
        System.out.println("p-namespace Injection  -> " + emp3);

        // get bean method:
        Employee emp4 = context.getBean("employee4", Employee.class);
        System.out.println("getBean method         -> " + emp4);
        // explanation: getBean() is used to retrieve a bean from the Spring container.
        // It can be called with just the bean name, or with both the bean name and the expected type.
        // The second form (getBean("beanName", BeanClass.class)) is preferred as it provides type safety and eliminates the need for explicit casting.

        // Close the context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
