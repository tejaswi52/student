import java.util.*;
import java.lang.*;
import java.io.*;
class P22
{
    public static void main (String[] args)
    {
char ch='p';
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
           if(Character.isUpperCase(ch))
                System.out.print(Character.toLowerCase(ch));
            else
                System.out.print(Character.toUpperCase(ch));
        }
    }

