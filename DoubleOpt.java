/*2. Similarly write the DoubleOpt.java program by taking double value and doing the
same operations.*/

import java.util.*;
class DoubleOpt
{
public static void main(String[] args)
{
double a,b,c,d,e,f,g;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a:");
a=sc.nextDouble();
System.out.println("enter the value of b:");
b=sc.nextDouble();
System.out.println("enter the value of c:");
c=sc.nextDouble();

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

