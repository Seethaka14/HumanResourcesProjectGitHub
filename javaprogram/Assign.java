import java.util.*;
class Assign{
static void Square(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number which you want to square:");
int a=sc.nextInt();
int b=a*a;
System.out.println("the square of the number is: "+b);
}
static void Rectangle(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the 1st number :");
int a=sc.nextInt();
System.out.println("enter the 2nd number :");
int b=sc.nextInt();
int c=a*b;
System.out.println("the area of the rectangle is: "+c);
}
static void Circle(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number :");
int a=sc.nextInt();
double b=3.14*(a*a);
System.out.println("the area of the circle is: "+b);
}
static void Triangle(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the 1st number :");
int a=sc.nextInt();
System.out.println("enter the 2nd number :");
int b=sc.nextInt();
double c=0.5*(a*b);
System.out.println("the area of the Triangle is: "+c);
}
public static void main(String args[]){
Square();
Rectangle();
Circle();
Triangle();
}
}
