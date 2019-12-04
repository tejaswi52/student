import java.io.*;
import java.util.*;
class P21
{
public static void main(String args[])
{
int r,n,rev=0;
int t;
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
n=sc.nextInt();
t=n;
while(n>0)
{
r=n%10;
rev=rev*10+r;
n=n/10;
}
if(t==rev)
System.out.println("palindrome number");
else
System.out.println("not palindrome");
}
}