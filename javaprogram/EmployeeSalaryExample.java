import java.util.Scanner;
class EmployeeSalaryExample{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);   //to take input from user
System.out.println("enter the age of the employee");
int employeeAge=scanner.nextInt(); 
System.out.println("enter the salary of the employee");
double EmployeeSalary=scanner.nextDouble();  //read the integer value
System.out.println(EmployeeSalary);
boolean status=scanner.nextBoolean();
System.out.println("Enter the status");
float marks=scanner.nextFloat();
System.out.println("Enter the marks");
byte bvalue=scanner.nextByte();
System.out.println("Enter the value");
long lvalue=scanner.nextLong();
System.out.println("Enter the long value");
String name=scanner.next();
System.out.println("Enter the Name");
}
}
   