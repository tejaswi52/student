import java.io.*;
import java.util.*;
class P13
{
public static void main(String args[])
{
String a=args[0];
int age=Integer.parseInt(args[1]);
if(a.equals("female")&&(age>=1&&age<=58))
System.out.println("Intrest=8.2%");
else if(a.equals("female")&&(age>=59&&age<=120))
System.out.println("Intrest=7.6%");
else if(a.equals("male")&&(age>=1&&age<=60))
System.out.println("Intrest=9.2%");
else if(a.equals("male")&&(age>=61&&age<=120))
System.out.println("Intrest=8.3%");
else
System.out.println("invaid");
}
}

