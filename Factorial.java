import java.util.*;
public class Factorial 
{
 int n;
 public void input(int x)
 {
     n=x;
 }   
  public int fact()
  {
      int i=0,f=1;
      for(i=1;i<=n;i++)
      {
          f=f*i;
      }
      return(f);
  }
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a no");
      int a=sc.nextInt();
      Factorial ob=new Factorial();
      ob.input(a);
      int s=ob.fact();
      System.out.println("The factorial is"+s);
    }
}
