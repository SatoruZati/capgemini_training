### Spring Framework

---

- How many modules are there in spring framework?\
There are 20 modules in the spring framework.


```
+--------------------------------------+
|      Spring Core                     |
+--------------------------------------+
|   Spring AOP (Aspect                 |
|   Oriented Programming)              |
+--------------------------------------+
|   Spring Data Access                 |
+--------------------------------------+
|   Spring Web                         |
+--------------------------------------+
|   Spring MVC (Model-View-Controller) |
+--------------------------------------+
|   Spring Security                    |
+--------------------------------------+
|   Spring Testing                     |
+--------------------------------------+
|   Spring Batch                       |
+--------------------------------------+
|   Spring Integration                 |   
+--------------------------------------+
|   Spring Cloud                       |
+--------------------------------------+
|   Spring Boot                        |
|   Spring Boot + Data JPA             |
+--------------------------------------+
|   Spring Rest                        |
+--------------------------------------+
```

In Spring MVC we have to write frontend code in JSP (Java Server Pages) and backend code in Java. 
They caused a lot of conflict and made the codebase very messy. So, to solve this problem, spring boot was introduced. It is a module of spring framework that provides a simplified and opinionated approach to building applications. It eliminates the need for writing boilerplate code and allows developers to focus on writing business logic. With spring boot, you can easily create standalone applications with embedded servers, making it easier to deploy and run your applications. It also provides features such as auto-configuration, which automatically configures your application based on the dependencies you have added, and a wide range of starter dependencies that make it easy to add functionality to your application. Overall, spring boot helps to simplify the development process and improve productivity when building applications with the spring framework.

In Spring Rest, we can write frontend code in any language or framework (like React, Angular, etc.) and backend code in Java. It provides a more flexible and decoupled architecture, allowing developers to choose the best tools and technologies for their specific needs. Spring Rest is a module of the spring framework that provides support for building RESTful web services. It allows developers to easily create APIs that can be consumed by various clients, such as web browsers, mobile applications, and other services. With spring rest, you can define your API endpoints using annotations and handle HTTP requests and responses in a straightforward manner. It also provides features such as content negotiation, which allows clients to specify the desired format for the response (e.g., JSON or XML), and support for various authentication and authorization mechanisms. Overall, spring rest helps to simplify the development of RESTful web services and enables developers to build scalable and maintainable APIs with ease.
We can write backend logic in Java and frontend code in any language or framework (like React, Angular, etc.) when using Spring Rest. This allows for a more flexible and decoupled architecture, enabling developers to choose the best tools and technologies for their specific needs. Spring Rest is a module of the spring framework that provides support for building RESTful web services. It allows developers to easily create APIs that can be consumed by various clients, such as web browsers, mobile applications, and other services. With spring rest, you can define your API endpoints using annotations and handle HTTP requests and responses in a straightforward manner. It also provides features such as content negotiation, which allows clients to specify the desired format for the response (e.g., JSON or XML), and support for various authentication and authorization mechanisms. Overall, spring rest helps to simplify the development of RESTful web services and enables developers to build scalable and maintainable APIs with ease.

---
A software development principle called Inversion of Control (IoC) is a design pattern that promotes loose coupling and separation of concerns in software development. It is a fundamental principle in the spring framework and is achieved through the use of dependency injection. Inversion of Control allows developers to delegate the responsibility of managing dependencies to a container or framework, rather than having the components themselves manage their dependencies. This promotes flexibility, testability, and maintainability in software applications, as it allows for easier swapping of implementations and reduces tight coupling between components. Overall, Inversion of Control is a key principle that helps to improve the design and architecture of software applications. Spring framework provides a powerful implementation of Inversion of Control through its dependency injection mechanism, allowing developers to easily manage and inject dependencies into their applications.

---
As inversion of control is achieved through dependency injection, it allows for better separation of concerns and promotes loose coupling between components. This means that components can be easily swapped or replaced without affecting the overall functionality of the application. It also makes it easier to test individual components in isolation, as dependencies can be easily mocked or stubbed. Additionally, inversion of control promotes a more modular and maintainable codebase, as it encourages developers to focus on the specific responsibilities of each component rather than managing dependencies. Overall, inversion of control is a key principle that helps to improve the design and architecture of software applications, making them more flexible, testable, and maintainable.