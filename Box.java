import java.io.*;
import java.util.*;
class Volume
{
double dimension(double w,double h,double d)
{
double width=w;
double height=h;
double depth=d;
double s=width*height*depth;
return s;
}
}
class Box
{
public static void main(String [] args)
{

Volume v=new Volume();
double w=23;
double h=21;
double d=35;
 double k=v.dimension(w,h,d);
System.out.println(k);

}
}

