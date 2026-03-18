# Spring MVC and Spring Boot Notes

## Session Agenda
1. MVC Architecture and Front Controller Design Pattern
2. Spring MVC Framework
3. Spring Boot Framework: Architecture and Introduction
4. Spring Boot Starter Projects

---

## `@Bean` vs `@Component` in Spring
Both `@Bean` and `@Component` register objects as beans in the Spring container, but they are used in different situations.

### Two common ways to create beans
1. `@Component`
2. `@Bean`

### When to use `@Component`
Use `@Component` when:
- The class is under your control (you can edit its source code).
- You want Spring to auto-detect and register the class using component scanning.

### When to use `@Bean`
Use `@Bean` when:
- The class is not under your control (for example, from a third-party library).
- You want explicit control over how the object is created (constructor args, property setup, init/destroy methods, etc.).

---

## Spring MVC Overview
Spring MVC is a module of the Spring Framework used to build web applications using the **Model-View-Controller (MVC)** pattern.

### MVC Components
- **Model**: Represents application data and business logic.
- **View**: UI/presentation layer (for example JSP, Thymeleaf) that displays data.
- **Controller**: Handles requests, calls business logic, and returns the appropriate view.

In Spring MVC, controllers are typically classes annotated with `@Controller` or `@RestController`.

---


## Front Controller Design Pattern
The **Front Controller** pattern uses one central controller to receive all incoming requests and route them to the correct handlers.

In Spring MVC, this front controller is **`DispatcherServlet`**.

### What `DispatcherServlet` does
- Receives every HTTP request.
- Maps requests to appropriate controller methods.
- Coordinates view resolution.
- Handles exception flow and integration with handler mappings/view technologies.

### Request Flow (high-level)
1. Client sends request.
2. `DispatcherServlet` receives it.
3. Request is dispatched to the correct controller/handler.
4. Handler processes business logic.
5. View is resolved and response is returned.

### Simple Request Flow Diagram (`DispatcherServlet`)
```
Client (Browser)
    |
    v
DispatcherServlet (Front Controller)
    |
    v
HandlerMapping -> Controller -> Service/Business Logic
    |
    v
Controller returns Model + View Name
    |
    v
ViewResolver -> View (JSP/Thymeleaf)
    |
    v
HTTP Response to Client
```

Mermaid diagram for better visualization:

```
flowchart TD
    A[Client (Browser)] --> B[DispatcherServlet (Front Controller)]
    B --> C[HandlerMapping]
    C --> D[Controller]
    D --> E[Service / Business Logic]
    E --> F[Controller returns Model + View Name]
    F --> G[ViewResolver]
    G --> H[View (JSP / Thymeleaf)]
    H --> I[HTTP Response to Client]
```

This shows the standard server-side rendering flow in Spring MVC. `DispatcherServlet` acts as the central entry point and coordinates routing and view resolution.

---

## JSP and Rendering Approaches
### JSP (JavaServer Pages)
JSP is used to build dynamic pages by embedding Java in HTML templates.

In Spring MVC projects, JSP files are commonly placed under `WEB-INF/views`, and `DispatcherServlet` resolves the correct view.

### SSR vs CSR
- **SSR (Server-Side Rendering)**: Server generates full HTML before sending it to the browser.
- **CSR (Client-Side Rendering)**: Browser generates UI using JavaScript after receiving data.

---

## Who Handles HTTP Requests in Java?
A **Servlet** is a Java server-side component that handles HTTP requests.

### Traditional Servlet Approach
- Typically maps each feature/request to separate servlet classes.
- As features grow, the number of servlet classes increases and maintenance becomes harder.

### Spring MVC Approach
- Uses one main servlet: **`DispatcherServlet`**.
- Routes many different requests to handler methods in controller classes.
- Results in cleaner architecture and easier maintenance.

---

### What is Apache Tomcat Server? 
Apache Tomcat Server is commonly used to run Spring MVC applications, and it handles the deployment and execution of servlets, including `DispatcherServlet`.

---

DTO: Data Transfer Object
View Resolver : View is actually a JSP file that renders the HTML response. The view resolver maps the logical view name returned by the controller to the actual JSP file.
Suffix : file extension for JSP (e.g., `.jsp`)
Prefix : path to JSP files (e.g., `/WEB-INF/views/`)

---
Spring Boot doesnt need external server, it comes with embedded server. But for Spring MVC, we need server which is Tomcat by default. It simplifies deployment and development by packaging the application as a standalone JAR with an embedded server.

---
SpringBoot is also called RAD (Rapid Application Development) tool. 
We can develop production level application using SpringBoot in very less time. It provides a lot of features out of the box, such as auto-configuration, embedded servers, and starter dependencies, which significantly reduce the amount of boilerplate code and configuration needed to set up a Spring application.

Auto-configuration is a powerful feature of Spring Boot that automatically configures your application based on the dependencies you have added. For example, if you include `spring-boot-starter-web`, Spring Boot will automatically configure a web application with an embedded Tomcat server, and set up default configurations for things like view resolvers and message converters.

---
