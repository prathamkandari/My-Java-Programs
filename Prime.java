import java.util.*;
public class Prime
{
 int n;
 public void input(int a)
 {
     n=a;
 }
    public char isPrime()
    {
        int i=0,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return('Y');
        else
        return('N');    
    }  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int x=sc.nextInt();
        Prime ob=new Prime();
        ob.input(x);
        char ch=ob.isPrime();
        if(ch=='Y')
        System.out.println("Prime");
        else
        System.out.println("Not Prime");
    }
}




    
