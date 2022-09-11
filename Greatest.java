import java.util.*;
class Greatest
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter two numbers");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int max=0;
         if(a>b)
         max=a;
         else
         max=b;
         System.out.println("The greatest no is"+max);
     }
}