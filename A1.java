import java.io.*;
import java.util.*;
class Animal
{
public void eat()
{
System.out.println("this is eat method");
}
public void sleep()
{
System.out.println("this is sleep method");
}
}
class Bird extends Animal
{
public void eat()
{
System.out.println("this is eat method");
}
public void sleep()
{
System.out.println("this is sleep method");
}
public void fly()
{
System.out.println("this is fly method");
}
}
class A1
{
public static void main(String[] args)
{
Bird b=new Bird();
b.eat();
b.sleep();
b.fly();
}
}