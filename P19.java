import java.io.*;
import java.util.*;
class P19
{
public static void main(String args[])
{
int count=0;
for(int i=1;i<=1000;i++)
{
if(i%2==0 && i%3==0 && i%5==0 && count<5)
{
System.out.println(i+" ");
count++;
}
}
}
}