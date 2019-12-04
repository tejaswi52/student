import java.io.*;
import java.util.*;
class P10
{
public static void main(String args[])
{ 
int i;
System.out.println("enter the color");
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
switch(i)
{
case 0:System.out.println("Red");
       break;
case 1:System.out.println("Blue");
       break;
case 2:System.out.println("Green");
       break;
case 3:System.out.println("Orange");
       break;
case 4:System.out.println("Yellow");
       break;
case 5:System.out.println("White");
       break;
default:System.out.println("Invalid code");
       break;
}
}
}