/*8. Coupon Numbers
a. Desc ­> Given N distinct Coupon Numbers, how many random numbers do you
need to generate distinct coupon number? This program simulates this random
process.
b. I/P ­> N Distinct Coupon Number
c. Logic ­> repeatedly choose a random number and check whether it's a new one.
d. O/P ­> total random number needed to have all distinct numbers.
e. Functions => Write Class Static Functions to generate random number and to
process distinct coupons.*/

class CouponNumber
{
public static int getCoupon(int n)
{
return (int)(Math.random()*n);
}
public static int collect(int n)
{
boolean[] isCollected=new boolean[n];
int count=0;
int distinct=0;
while(distinct<n)
{
int value=getCoupon(n);
count++;
if(!isCollected[value])
{
distinct++;
isCollected[value]=true;
}
}
return count;
} 
public static void main(String[] args)
{
int n;
n=Integer.parseInt(args[0]);
int count=collect(n);
System.out.println(count);
}
}


