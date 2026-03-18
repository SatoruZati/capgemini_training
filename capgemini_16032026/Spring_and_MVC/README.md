# Spring_and_MVC Tomcat Starter

This project is configured as a Maven WAR for Apache Tomcat 10.

## What is included
- `pom.xml` with `war` packaging
- `jakarta.servlet-api` (provided scope)
- Sample servlet: `src/main/java/org/example/web/HelloServlet.java`
- Landing page: `src/main/webapp/index.jsp`

## Run with Smart Tomcat (IntelliJ Community)
1. Install **Smart Tomcat** plugin.
2. Create a **Smart Tomcat** run configuration.
3. Set **Tomcat Server** to:
   `C:\Local Drive\Capgemini_training\apache-tomcat-10.1.52`
4. Set **Deployment Directory** to:
   `src/main/webapp`
5. Set **Context Path** to `/` and port `8000`.
6. Run and open:
   - `http://localhost:8000/`
   - `http://localhost:8000/hello`

## Build check
```powershell
mvn clean package
```

Generated WAR:
- `target/Spring_and_MVC-1.0-SNAPSHOT.war`

