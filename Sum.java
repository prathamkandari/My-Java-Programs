import java.util.*;
class Sum
{ 
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int i=0,sum=0;
      for(i=0;i<5;i++)
      {
        System.out.println("Enter a no");
        int n=sc.nextInt();
        sum=sum+n;
      }
      System.out.println("The sum is"+" "+sum);
    }
}