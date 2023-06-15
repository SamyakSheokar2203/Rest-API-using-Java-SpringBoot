## Built REST API using Java spring boot Application with database

## Introduction
This application is a RESTful API built using Java Spring Boot, which provides a set of endpoints to perform CRUD (Create, Read, Update, Delete) operations on a database. The API follows REST architectural principles and supports JSON data format.

## Features
* Create, read, update, and delete resources using HTTP methods.
* Validate request data and handle error cases gracefully.
* Utilize database for persistent storage of resources.

## Technologies Used
* Java: Programming language.
* Spring Boot: Framework for building Java applications.
* Spring MVC: Web framework for building RESTful APIs.
* Spring Data JPA: Persistence framework for interacting with the database.
* Hibernate: Object-relational mapping library.
* MySQL: Database for persistent storage.
* JSON: Data format for request and response payloads.
* Git: Version control system.

## Getting Started
To run the application on your local machine, follow these steps:

1. Clone the repository: git clone <https://github.com/SamyakSheokar2203/Rest-API-using-Java-SpringBoot.git>

2. Navigate to the project directory: cd <Rest-API-using-Java-SpringBoot/tree/main/src/main/java/com/springrest/springrest>

3. Install the necessary dependencies: mvn install
4. Configure the database connection in the application.properties file.
5. Run the application: mvn spring-boot: run
6. The API will be available at http://localhost:8080/api.

## API Endpoints
The following are the main endpoints provided by the API:

* GET /api/resources: Retrieves a list of resources.
* GET /api/resources/{id}: Retrieves a specific resource by ID.
* POST /api/resources: Creates a new resource.
* PUT /api/resources/{id}: Updates an existing resource.
* DELETE /api/resources/{id}: Deletes a resource.

Refer to the API documentation for detailed information about each endpoint and their request/response payloads. [Oracle](https://docs.oracle.com/javase/8/docs/api/)
