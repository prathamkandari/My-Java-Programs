import java.util.*;
public class Time 
{
    int hrs;
    int min;
    public void input(int x,int y)
  { 
    hrs=x;
    min=y;
   } 
 public int convert()
 {
     int s=hrs*60+min;
     return(s);
 }
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the hours and minutes");
      int hrs=sc.nextInt();
      int min=sc.nextInt();
      Time ob=new Time();    
      ob.input(hrs,min);
      int s=ob.convert();
      System.out.println("The actual time is"+s);
  }
}
