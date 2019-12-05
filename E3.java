import java.io.*;
import java.util.*;
class E3
{
public static void main(String[] args)
{
int[] arr=new int[] {2,45,36,98,7,1};
Scanner sc=new Scanner(System.in);
System.out.println("search element");
int j=sc.nextInt();
for(int i=0;i<arr.length;i++)
{
if(arr[i]==j)
{
System.out.println(i);
break;
}
}
if(i>=arr.length)
System.out.println("-1"); 
}
}