package model;

import java.util.Scanner;

public interface Option {

    abstract void oper(Employee user, Scanner s, Database database);

}
