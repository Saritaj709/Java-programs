/*3. Write a LeapYear.java program that takes a year as input and outputs the Year is
a Leap Year or not a Leap Year.
The LeapYear program only works for year >= 1582, corresponding to a year in
the Gregorian calendar. So ensure to check for the same. Further the Leap Year
is a Year divisible by 4 and not 100 unless it is divisible by 400. For e.g. 1800 is
not a Leap Year and 2000 is a Leap Year. */

import java.util.Scanner;
public class LeapYear
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any year:");
int year=sc.nextInt();
boolean flag=false;
if(year<1582)
System.out.println("enter year above 1582");
if(year%4==0&&year%100!=0)
flag=true;
else if(year%4==0&&year%100==0&&year%400==0)
flag=true;		
else if(year%400==0)
flag=true;
else
flag=false;
if(flag)
System.out.println("Year " + year + " is a leap year");
else
System.out.println("Year " + year + " is not a leap year");
}
}

