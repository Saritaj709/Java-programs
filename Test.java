import java.io.*;
import java.util.*;
class Test
{
static void push(Stack stack)
{
for(int i=0;i<5;i++)
{
stack.push(i);
}
}
static void pop(Stack stack)
{
System.out.println("Pop:");
for(int i=0;i<5;i++)
{
int y; 
y=stack.pop();
System.out.println(y);
}
}
/*static void peek(Stack stack)
{
int element;
element=stack.peek();
System.out.println("Element on stack top:"+element);
}
static void search(Stack stack,int element)
{
int pos; 
pos=stack.search(element);
if(pos==-1)
System.out.println("Element not found");
else
System.out.println("Element is found at position"+pos);
}*/
public static void main(String[] args)
{
Stack stack=new Stack();
push(stack);
pop(stack);
push(stack);
//peek(stack);
//search(stack,2);
//search(stack,6);
}
}

