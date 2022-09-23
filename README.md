# cinema-app
### Project description:
```
Web application that supports authentication, registration and CRUD operations with implemented API.
```
## Features:
- registration like a driver;
- authentication like a driver;
- create/update/remove a manufacturer;
- create/update/remove a car;
- create/update/remove a driver;
- display list of all manufacturers;
- display list of all cars;
- display list of all drivers;
- display list of all cars by current driver;
- add driver to car.
## Project structure (3-layer architecture):
- DAO - Data access layer
- Service - Application logic layer
- Controllers - Presentation layer
## Used technologies and libraries:
- Java 11
- Git
- Apache Maven
- Apache Tomcat
- Apache Log4j 2
- MySQL
- JDBC
- Javax Servlet
- JSP
- JSTL
- HTML/CSS
- Checkstyle plugin
- Project Lombok
## Startup instructions
- Startup instructions
- Install Intellij IDEA Ultimate
- Install MySql
- Install Apache Tomcat
- Configure Apache Tomcat for your IDE
- Clone this project
- Create a database by using the SQL queries from the init_db.sql file
- Change USERNAME, PASSWORD and URL values in the /util/ConnectionUtil.java
- Launch application and start using it at http://localhost:%your_port%