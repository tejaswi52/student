import java.io.*;
import java.util.*;
class P17
{
public static void main(String args[])
{
 int num=99;
   for(int i=10;i<=num;i++)
{
int cnt=0;
   for(int j=1;j<=i;j++)
   {
   if(i%j==0)
   cnt++;
}
if(cnt==2)
System.out.println(i);
}
}
}

