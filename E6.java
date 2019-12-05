import java.io.*;
import java.util.*;
class E6
{
public static void main(String args[])
 {
int a[]=new int[]{2,20,34,12,67};
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
int temp;
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for (int i=0;i<a.length;i++) 
{
System.out.print("sorted Order is"+a[i]);
 }
}

}