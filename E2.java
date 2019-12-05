import java.io.*;
import java.util.*;
class E2
{
public static void main(String[] args)
{
int[] arr1= new int[] {1,4,3,6,7,2,8};
int max=0,i;
for(i=0;i<arr1.length;i++)
{
if(arr1[i]>max)
{
max=arr1[i];
}
}
System.out.println(max);
int min=arr1[0];
for(i=0;i<arr1.length;i++)
{
if(arr1[i]<min)
{
min=arr1[i];
}
}
System.out.println(min);
}
}