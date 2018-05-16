/*2. Flip Coin and print percentage of Heads and Tails
a. I/P ­> The number of times to Flip Coin. Ensure it is positive integer.
b. Logic ­> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
heads
c. O/P ­> Percentage of Head vs Tails */

import java.util.Random;
import java.util.*;
class Coin
{
public static void main(String[] args)
{
int i,n;
double head=0.0,tail=0.0;
double headp,tailp;
System.out.println("enter the no. of times the coin flips");
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
if(n<0)
System.out.println("invalid");
else
System.out.println(+n +"is the no. of times the coin flips");
double arr[]=new double[20];
for(i=0;i<n;i++){
arr[i]=Math.random();
if(arr[i]<0.5){
tail=tail+arr[i];
System.out.println("tail " +tail);}
else //if(arr[i]>0.5)
{
head=head+arr[i];
System.out.println("head " +head);
}
System.out.println("no. " +arr[i]);}
headp=head*100;
tailp=tail*100;
System.out.println("PercentageHVT " +headp);
System.out.println("PercentageTVH " +tailp);
}
}
