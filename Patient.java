import java.io.*;
import java.util.*;
class Health
{
public double Bmi(String n,double w,double h)
{
String name=n;
double weight=w,height=h;
double m=(w/(h*h))*703;
return m;
}
}
class Patient
{
public static void main(String[] args)
{
Health p=new Health();
String n="ravi";
double w=65,h=5.9;
double k=p.Bmi(n,w,h);
System.out.println(k);
}
}
