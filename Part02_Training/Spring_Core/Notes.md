there are two types of configuration:

1. xml based config
2. java based or class based config

Java Bean file:

```
java
public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

xml based config:

```
xml<beans>
    <bean id="user" class="com.example.User">
        <property name="name" value="John Doe"/>
        <property name="age" value="30"/>
    </bean>
</beans>
```
java based config:

```
java@Configuration
public class AppConfig {
    @Bean
    public User user() {
        User user = new User();
        user.setName("John Doe");
        user.setAge(30);
        return user;
    }
}
```

---
NoUniqueBeanDefinitionException: No qualifying bean of type 'com.example.User' available: expected single matching bean but found 2: user,user2

This happens when there are multiple beans of the same type defined in the Spring context, and Spring is unable to determine which one to inject when a dependency of that type is required. In this case, there are two beans of type 'com.example.User' defined (user and user2), and Spring does not know which one to use when it encounters a dependency of type 'com.example.User'. To resolve this issue, you can either specify a primary bean using the @Primary annotation or use the @Qualifier annotation to explicitly indicate which bean should be injected.
