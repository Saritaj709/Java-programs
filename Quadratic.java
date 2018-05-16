/*5. Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula
delta = b*b ­ 4*a*c
Root 1 of x = (­b + sqrt(delta))/(2*a)
Root 2 of x = (­b ­ sqrt(delta))/(2*a)
Take a, b and c as input values to find the roots of x.*/

import java.util.*;
//import java.util.Math;
class Quadratic
{
public static void main(String[] args)
{
int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
double delta,Root1,Root2;
//eq=a*x*x+b*x+c;
//System.out.println("enter the equation" +a+"*x*x"+b+"*x"+c);
delta=b*b-4*a*c;
Root1=(-b+sqrt(delta))/(2*a);
Root2=(-b-sqrt(delta))/(2*a);
System.out.println("Root1:"+Root1);
System.out.println("Root2:"+Root2);
}
public static double sqrt(double x)
{
double y=x*x;
return y;
}
}


