/*6.Write a program Distance.java that takes two integer command­line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function*/

import java.util.*;
class Distance
{
public static void main(String[] args)
{
System.out.println("enter x "+args[0]);
System.out.println("enter y "+args[1]);
int x=Integer.parseInt(args[0]);
int y=Integer.parseInt(args[1]);
double a=(double)x;
double b=(double)y;
double distance=Math.pow(x,2)+Math.pow(y,2);
System.out.println(Math.sqrt(distance));
}
}

