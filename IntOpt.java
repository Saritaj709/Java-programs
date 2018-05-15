/*1. Write a IntOpt.java program by taking a, b and c as input values and print the
following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please
also understand the precedence of the operators. */

import java.util.*;
class IntOpt
{
public static void main(String[] args)
{
int a,b,c,d,e,f,g;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a:");
a=sc.nextInt();
System.out.println("enter the value of b:");
b=sc.nextInt();
System.out.println("enter the value of c:");
c=sc.nextInt();

d=a+b*c;
e=a*b+c;
f=c+a/b;
g=a%b+c;

System.out.println("first:" +d);
System.out.println("second:" +e);
System.out.println("third:" +f);
System.out.println("fourth" +g);
}
}

