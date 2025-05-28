package controller.employee;

import java.util.Scanner;

import model.Database;
import model.Employee;
import model.Option;

public class CreateEmployee implements Option{

   public CreateEmployee(Employee e, Database database){

        String insert = "INSERT INTO employees (firstName, lastName, email, phoneNumber, address, salary, department, password) VALUES ('"
                + e.getFirstName() + "', '" + e.getLastName() + "', '" + e.getEmail() + "', '"
                + e.getPhoneNumber() + "', '" + e.getAddress() + "', " + e.getSalary() + ", '"
                  + e.getDepartment() + "', '"
                + e.getPassword() + "')";

      try {
            database.getStatement().executeUpdate(insert);
            System.out.println("Employee created successfully.");
        } catch (Exception ex) {
            System.out.println("Error creating employee: " + ex.getMessage());
        }

   }

   @Override
   public void oper(Employee user, Scanner s, Database database) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'oper'");
   }

   @Override
   public String getOption() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'getOption'");
   }

}
