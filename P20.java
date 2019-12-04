import java.io.*;
import java.util.*;
class P20
{
public static void main(String args[])
{
int n,rev=0,r;
System.out.println("enter n values");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n!=0)
{
r=n%10;
rev=rev*10+r;
n=n/10;
}
System.out.println(rev);
}
}