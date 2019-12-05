import java.lang.*;
class E5
{
public static void main(String args[])
{
int [] a=new int[] {1,5,4,9,8,2,10};
int max=a[0],min=a[0],max1=a[0],min1=a[0];
for(int i=1;i<a.length;i++)
{
 if(a[i]>max)
 {
  max=a[i];
 }
 if(a[i]<min)
 {
  min=a[i];
  }
 if(a[i]>max1&&a[i]!=max)
 {
  max1=a[i];
 }
 if(a[i]<min1&&a[i]!=min)
 {
  min1=a[i];
  }
}
 System.out.println("max num1 ="+max);
 System.out.println("min num1 ="+min);
 System.out.println("max num2 ="+max1);
 System.out.println("min num2 ="+min1);
}
}