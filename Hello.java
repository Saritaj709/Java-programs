/*1. User Input and Replace String Template “Hello <<UserName>>, How are you?”
a. I/P ­> Take User Name as Input. Ensure UserName has min 3 char
b. Logic ­> Replace <<UserName>> with the proper name
c. O/P ­> Print the String with User Name*/

import java.util.*;
class Hello
{
public static void main(String[] args)
{
String s1;
Scanner sc=new Scanner(System.in);
System.out.println("enter username");
s1=sc.nextLine();
char input[]=s1.toCharArray();
if(input.length<3)
System.out.println("enter name with more chars");
else
System.out.println("Hello " + s1 +",How are you?");
}
}

