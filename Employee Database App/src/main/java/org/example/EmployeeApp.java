package org.example;


import org.example.DAO.EmployeeDAO;
import org.example.Model.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        while (true) {
            System.out.println("\n===== Employee Database Menu =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();
                    Employee emp = new Employee(name, dept, salary);
                    System.out.println(dao.addEmployee(emp) ? " Added!" : " Failed.");
                }
                case 2 -> {
                    List<Employee> employees = dao.getAllEmployees();
                    if (employees.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        employees.forEach(System.out::println);
                    }
                }
                case 3 -> {
                    System.out.print("Enter ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter new department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter new salary: ");
                    double salary = sc.nextDouble();
                    Employee emp = new Employee(id, name, dept, salary);
                    System.out.println(dao.updateEmployee(emp) ? " Updated!" : " Failed.");
                }
                case 4 -> {
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();
                    System.out.println(dao.deleteEmployee(id) ? " Deleted!" : " Failed.");
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }
}
