import java.util.Scanner;
class P25
{
 public static void main(String args[])
{ Scanner sc=new Scanner(System.in);
boolean g;
   do{
   System.out.println("1.Add");
System.out.println("2.Sub");
System.out.println("Enter your option");
int a=sc.nextInt();
System.out.println("enter the numbers");
int b=sc.nextInt();
int c=sc.nextInt();
if(a==1)
{
int d=a+b;
}
if(a==2)
{int e=a-b;
}

System.out.println("Do you want to continue");
String str=sc.next();
if((str.equals("y")) || (str.equals("Y")))
g=true;
else
break;
}while(g);  
}
}
