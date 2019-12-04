import java.io.*;
import java.util.*;
class P12
{
public static void main(String args[])
{
int i,cnt=0,n;
System.out.println("enter n values");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
cnt++;
}
if(cnt==2)
System.out.println("Prime");
else
System.out.println("not Prime");
}
}