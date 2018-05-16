/*5. Harmonic Number
a. Desc ­> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P ­> The Harmonic Value N. Ensure N != 0
c. Logic ­> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P ­> Print the Nth Harmonic Value.*/

import java.util.Scanner;
class Harmonic
{
public static void main(String[] args)
{
double N;double sum=0.0;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
System.out.println("N value :" +N);
if(N==0)
System.out.println("invalid");
for(double i=1;i<=N;i++)
sum=sum+1/i;
double sum2=1/N;
System.out.println(+sum);
System.out.println(+sum2);
}
}

