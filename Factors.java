/*6. Factors
a. Desc ­> Computes the prime factorization of N using brute force.
b. I/P ­> Number to find the prime factors
c. Logic ­> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P ­> Print the prime factors of number N.*/

import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class Factors
{
public static void main(String[] args)
{
int n;
System.out.println("enter the no.");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n%2==0)
{
System.out.println(2 + " ");
n /=2;
}
for(int i=3;i*i<=n;i+=2)
{
while(n%i==0)
{
System.out.println(i);
n /=i;
}}

if(n>2)
{
System.out.println(+n);
}
}
}


