# Spring Boot Learning Project - Big Event API

## Project Overview
This is a **Spring Boot** backend API project created for learning purposes. It provides RESTful APIs for user management, article category management, and article management, making it a great resource for practicing Spring Boot development.

## Tech Stack
- **Spring Boot** - Java backend framework
- **Spring MVC** - Handles HTTP requests
- **Spring Data JPA** - Database persistence
- **PostgreSQL** - Relational database
- **JWT** - Authentication and authorization
- **Lombok** - Reduces boilerplate code
- **Maven** - Build and dependency management

## Features
### 1. User Management
- **Register** - `/user/register`
- **Login** - `/user/login`
- **Get User Info** - `/user/userInfo`
- **Update User Info** - `/user/update`
- **Update Avatar** - `/user/updateAvatar`
- **Change Password** - `/user/updatePwd`

### 2. Article Category Management
- **Create Category** - `/category`
- **Get Category List** - `/category`
- **Get Category Details** - `/category/detail`
- **Update Category** - `/category`
- **Delete Category** - `/category`

### 3. Article Management
- **Publish Article** - `/article`
- **Get Article List** - `/article`
- **Get Article Details** - `/article/detail`
- **Update Article** - `/article`
- **Delete Article** - `/article`

### 4. Others
- **File Upload** - `/upload`

## How to Run the Project
### 1. Prerequisites
- JDK 17+
- PostgreSQL 14+
- Maven 3+

### 2. Configure Database
Update the database connection details in `application.properties` or `application.yml`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
```

### 3. Start the Application
```properties
mvn spring-boot:run
```



