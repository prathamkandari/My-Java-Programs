import java.util.*;
class MAXMIN
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int i=0,max=0,min=0;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter a no");
            a[i]=sc.nextInt();
            max=a[0];
            min=a[0];
        }
         for(i=0;i<10;i++)
         {
             if(a[i]>max)
             max=a[i];
             if(a[i]<min)
             min=a[i];
         }
         System.out.println("The maximum is"+max);
         System.out.println("The minimum is"+min);
   }
}