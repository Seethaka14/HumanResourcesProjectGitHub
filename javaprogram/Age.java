import java.util.Scanner;
class Age{
public static void main(String[] args)
{
 int age=25;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age:");
age=sc.nextInt();
Boolean status=age>18;
System.out.println(status);
}
}
