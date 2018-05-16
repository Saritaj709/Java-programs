/*1.Write a program “ PrintThreeNames.java ” that takes three names as input and
prints out a proper sentence with the names in the reverse of the order given, so
that for example, " java PrintThreeNames Alice Bob Carol " gives "Hi Carol, Bob,
and Alice.".*/

import java.util.*;
class PrintThreeNames
{
public static void main(String[] args)
{
String s1="Alice";
String s2="Bob";
String s3="Carol";
Scanner sc=new Scanner(System.in);
s1=sc.nextLine();
s2=sc.nextLine();
s3=sc.nextLine();
System.out.print("Hi ");
System.out.print(s3 + ", ");
System.out.print(s2 +", ");
System.out.println("and " + s1);
}}

