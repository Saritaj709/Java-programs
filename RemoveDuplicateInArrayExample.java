import java.util.Scanner;
public class RemoveDuplicateInArrayExample{
public static int removeDuplicateElements(int arr[],int n)
{
if(n==0||n==1)
{
return n;
}
int[] temp=new int[n];
int j=0;
for(int i=0;i<n-1;i++)
{
if(arr[i]!=arr[i+1])
{
temp[j++]=arr[i];
}
}
temp[j++]=arr[n-1];
for(int i=0;i<j;i++)
{
arr[i]=temp[i];
}
return j;
}
public static void main(String[] args)
{
//int arr[]={10,20,20,30,30,40,50,50};
int[] arr =new int[9];
int i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the elements of the array");
for(i=0;i<9;i++)
arr[i]=sc.nextInt();
int length=arr.length;
System.out.println("The unique elements are:");
length=removeDuplicateElements(arr,length);
for(i=0;i<length;i++)
System.out.println(arr[i]+"");
}
}

