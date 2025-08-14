# Employee Database CRUD App (Java + JDBC + MySQL)

## Overview
This is a simple **Java console-based application** that performs **CRUD (Create, Read, Update, Delete)** operations on an Employee database using **JDBC** and **MySQL**.  
The project is structured into different modules for better maintainability.

---

## 🛠️ Tech Stack
- **Java 17+**
- **MySQL 8+** 
- **JDBC**
- **IntelliJ IDEA**
- **Git & GitHub**

---

## 📂 Project Structure
EmployeeDBApp/
│
├── db/ # Database connection utility
│ └── DBConnection.java
│
├── model/ # Entity classes
│ └── Employee.java
│
├── dao/ # Data Access Layer (CRUD operations)
│ └── EmployeeDAO.java
│
├── main/ # Main application entry point
│ └── EmployeeApp.java
├── README.md # Project documentation



## 📋 Database Setup
Run the following SQL commands in MySQL:
--sql
CREATE DATABASE company;

USE company;

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(100) NOT NULL,
    salary DOUBLE NOT NULL
);

How to Run
Maven Project
Add the MySQL dependency in pom.xml:

xml
Copy
Edit
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.4.0</version>
</dependency>
Run:


 Features
Add a new employee

View all employees

Update existing employee details

Delete an employee by ID

Modular code with DAO pattern
