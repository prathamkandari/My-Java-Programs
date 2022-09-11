import java.util.*;
public class Factors
{
 int n;
 public void input(int x)
 {
     n=x;
 }
 public int sum_Digits()
 {
     int sum=0,r=0,t=n;
     while(t>0)
     {
         r=t%10;
         sum=sum+r;
         t=t/10;
        }
        return(sum);
}
        public void printfact()
        {
            int i=0;
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                System.out.println(i);
            }
        }     
        public int Reverse()
        {
            int q=0,p=n;
            int rev=0;
           while(p>0)
         {    
            q=p%10;
            rev=rev*10+q;
            p=p/10;
         }
        return(rev);
        }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Factors ob=new Factors();
        System.out.println("Enter a no");
        int a=sc.nextInt();
        ob.input(a);
        int p=ob.sum_Digits();
        System.out.println("The sum of digits is"+p);
        ob.printfact();   
        int q=ob.Reverse();
        System.out.println("The Reverse is"+q);
    }
}