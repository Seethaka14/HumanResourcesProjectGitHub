import java.util.Scanner;
class programs{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
int num1,num2,num3,num4,avg;
System.out.println("Enter the first num");
num1=scanner.nextInt();
System.out.println("Enter the second num");
num2=scanner.nextInt();
System.out.println("Enter the third num");
num3=scanner.nextInt();
System.out.println("Enter the fourth num");
num4=scanner.nextInt();
avg=(num1+num2+num3+num4)/4;
System.out.println("The Average is: "+avg);
}
}

