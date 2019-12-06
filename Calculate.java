import java.io.*;
import java.util.*;
import java.lang.*;
class Calculator
{
static int powerInt(int num1,int num2)
{
return ((int)Math.pow(num1,num2));
}
 static double powerDouble(double num3,int num4)
{
return Math.pow(num3,num4);
}
}
class Calculate
{
public static void main(String[] args)
{
System.out.println("for Interger"+Calculator.powerInt(10,2));
System.out.print("\nFor Double "+Calculator.powerDouble(2.22,2));
}
}
