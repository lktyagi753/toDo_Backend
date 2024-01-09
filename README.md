# toDo_Backend

This repo is dedicated to the backend server of the task management system. You can find the corresponding frontend repo [here]().

Welcome to the documentation for our Task Management System built with Spring Boot. This system provides a robust and scalable solution for managing tasks and projects efficiently.

## Getting Started

### Prerequisites
```
> Java 8 or higher
> Maven
> MySQL (or any other supported database)
```

## Installation
#### 1. Clone the repository:
```
git clone https://github.com/lktyagi753/toDo_Backend.git
```
#### 2.Navigate to the project directory:
```
cd toDo_Backend
```
#### 3.Build the project using Maven:
```
mvn clean install
```
#### 4.Run the application:
```
java -jar target/task-management-system.jar
```
![](https://raw.githubusercontent.com/lktyagi753/toDo_Backend/main/images/Screenshot%20(120).png)
<br>

## Configuration
#### Database Configuration
The application uses MySQL by default. You can configure the database connection in the application.properties file.
```
spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
spring.datasource.username=root
spring.datasource.password=rootpassword
```

# Usage
### API Endpoints
The Task Management System exposes RESTful API endpoints for various operations.

- API endpoint to add a new task
![](https://raw.githubusercontent.com/lktyagi753/toDo_Backend/main/images/Screenshot%20(122).png)
<br>

- API endpoint to fetch added tasks
![](https://raw.githubusercontent.com/lktyagi753/toDo_Backend/main/images/Screenshot%20(124).png)
<br>

- API endpoint to update any existing task
![](https://raw.githubusercontent.com/lktyagi753/toDo_Backend/main/images/Screenshot%20(125).png)
<br>

- API endpoint to delete any existing task
![](https://raw.githubusercontent.com/lktyagi753/toDo_Backend/main/images/Screenshot%20(126).png)
<br>



