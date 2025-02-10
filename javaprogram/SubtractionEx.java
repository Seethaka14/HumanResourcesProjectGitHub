import java.util.Scanner;
class SubtractionEx
{
static void subtraction()
{
Scanner scanner = new  Scanner(System.in);
int num1,num2;
System.out.println("enter the first number");
num1=scanner.nextInt();
System.out.println("enter the second number");
num2=scanner.nextInt();
System.out.println(num1-num2);
}
public static void main(String[] args)
{
subtraction();
}
}