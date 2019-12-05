import java.io.*;
import java.util.*;
class E1
{
public static void main(String[] args)
{
int[] arr={5,6,3,8,9,1};
int sum=0,i=0,avg=0;
for(i=0;i<6;i++)
{
sum=sum+arr[i];
avg=sum/6;
}
System.out.println(sum);
System.out.println(avg);
}
}