import java.util.*;
class OnlyPrime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int i=0,c=0,j=0;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter a no");
            a[i]=sc.nextInt();
        }
         for(i=0;i<10;i++)
         {
            c=0;
            for(j=1;j<=a[i];j++)
          {
              if(a[i]%j==0)
              c++;
          }
          if(c==2)
          System.out.print(a[i]+" "); 
        }
    }
}