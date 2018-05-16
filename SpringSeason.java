/*4. Write a program SpringSeason.java that takes two int values m and d from the
command line and prints true if day d of month m is between March 20 (m = 3, d
=20) and June 20 (m = 6, d = 20), false otherwise.*/

import java.util.*;
class SpringSeason
{
public static void main(String[] args)
{
int m,d;
Scanner sc=new Scanner(System.in);
System.out.println("enter month");
m=sc.nextInt();
System.out.println("enter day");
d=sc.nextInt();
if(m>12)
{
System.out.println("enter value less than 12");
}
if(d>31)
{
System.out.println("enter value less than 31");
}
if(m>=3 && m<6 && d>=20)
System.out.println("spring Season");
else if(m<=6&& m>3 && d<=20)
System.out.println("Spring season");
else
System.out.println("Not Spring Season");
}
}
 
