/*10. Write a program DayOfWeek.java that takes a date as input and prints the day of
the week that date falls on. Your program should take three command­line
arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February,
and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth.
Use the following formulas, for the Gregorian calendar (where / denotes integer
division):
y0 = y − (14 − m) / 12
x = y0 + y0
/4 − y0
/100 + y0
/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0

/ 12) mod 7 */

class DayOfWeek
{
public static void main(String[] args)
{
int m,d;
int year;
System.out.println("Month is " +args[0]);
System.out.println("Day is " +args[1]);
m=Integer.parseInt(args[0]);
d=Integer.parseInt(args[1]);
year=Integer.parseInt(args[2]);
if(m<1 || m>12)
{
System.out.println("Invalid month");
}
if(d<1 ||d>31)
{
System.out.println("Invalid day");
}
if(year<-10000 || year>10000)
{
System.out.println("Invalid year");
}
int y0=year - (14 - m)/12;
int x=y0+y0/4 - y0/100 +y0/400;
int m0=m+12*((14-m)/12)-2;
int d0=(d+x+31*m0/12)%7;
System.out.println(d0);
if(d0==0)
System.out.println("Sunday");
else if(d0==1)
System.out.println("Monday");
else if(d0==2)
System.out.println("Tuesday");
else if(d0==3)
System.out.println("wednesday");
else if(d0==4)
System.out.println("Thursday");
else if(d0==5)
System.out.println("Friday");
else
System.out.println("Saturday");
}
}

