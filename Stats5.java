/*8. Write a program Stats5.java that prints five uniform random values between 0 and 1,
their average value, and their minimum and maximum value. Use Math.random(),
Math.min(), and Math.max().*/

import java.util.Random;
class Stats5
{
public static void main(String[] args)
{
double a=0,b=0,c=0,d=0,e=0;
System.out.println("entering 5 random nos");
for(double i=0;i<1;i++)
{
a=Math.random();
b=Math.random();
c=Math.random();
d=Math.random();
e=Math.random();
System.out.println("first no." +a);
System.out.println("second no." +b);
System.out.println("third no." +c);
System.out.println("fourth no." +d);
System.out.println("fifth no." +e);
}
System.out.println("Minimum value is" +Math.min(0,1));
System.out.println("Maximum value is" +Math.max(0,1));
}
}

