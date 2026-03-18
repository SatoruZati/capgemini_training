### Spring IOC (Inversion of Control)

IOC and DI (Dependency Injection) are two related concepts in software development that promote loose coupling and separation of concerns. 
- Inversion of Control (IOC) is a design principle that allows developers to delegate the responsibility of managing dependencies to a container or framework, rather than having the components themselves manage their dependencies. 
- Dependency Injection (DI) is a specific implementation of IOC that involves injecting dependencies into a component rather than having the component create or manage its own dependencies. DI allows for better separation of concerns and promotes loose coupling between components, making it easier to swap or replace components without affecting the overall functionality of the application. 

Overall, both IOC and DI are important principles that help to improve the design and architecture of software applications, making them more flexible, testable, and maintainable.

---

Creational Design Patterns are a category of design patterns that focus on object creation mechanisms, trying to create objects in a manner suitable to the situation. They provide solutions to common problems related to object creation and help to promote flexibility and reusability in software design. 

Some examples of creational design patterns include the Singleton pattern, Factory pattern, Abstract Factory pattern, Builder pattern, and Prototype pattern. 

These patterns help to manage the complexity of object creation and provide a way to create objects in a controlled and efficient manner. Overall, creational design patterns are an important aspect of software design that can help to improve the maintainability and scalability of applications.

---
Singleton Design Pattern is a design pattern that restricts the instantiation of a class to a single instance and provides a global point of access to that instance. It ensures that only one instance of the class is created throughout the application and provides a way to access that instance from anywhere in the code. 

---
IOC Container or Spring Container is used to achieve Inversion of Control (IOC) and Dependency Injection (DI) in the spring framework. It is responsible for managing the lifecycle of beans (objects) and their dependencies. 

The IOC container creates, configures, and manages the beans based on the configuration provided by the developer. 

It also handles the injection of dependencies into the beans, allowing for loose coupling and separation of concerns in the application. The IOC container provides a powerful mechanism for managing the components of an application and promotes flexibility, testability, and maintainability in software development.

---
Box Hierarchy showing BeanFactory:

```
+------------------+
|   BeanFactory    | ---> XMLBeanFactory (deprecated) <Class>   | |   ApplicationContext (Advanced Container)  <Interface>  |
+------------------+                                                                   |       
                                                                                       |
                                                  -------------------------------------------------------------------------------
                                                  |                                     |                                       |
                                ClassPathXMLApplicationContext           FileSystemXmlApplicationContext        AnnotationConfigApplicationContext    
```
We will be using the containers to store beans and we shall create containers using XML configuration and Java Class-based configuration.

---
How many types of dependency injection are there in spring framework?
Constructor Injection, Setter Injection, Field Injection, and Interface Injection.

How many types of Container are there in spring framework?
There are two types of containers in the spring framework: BeanFactory and ApplicationContext.

