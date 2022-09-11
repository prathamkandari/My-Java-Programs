import java.util.*;
public class Armstrong
{
    int n;
    public void input(int x)
    {
        n=x;
    }
    public boolean isArm()
    {
        int t=n,r=0,sum=0;
        while(t>0)
        {
            r=t%10;
            sum=sum+r*r*r;
            t=t/10;
        }
        if(sum==n)
        return(true);
        else
        return(false);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int a=sc.nextInt();
        Armstrong ob = new Armstrong();
        ob.input(a);
        boolean x=ob.isArm();
        if(x==true)
        System.out.println("Armstrong No");
        else
        System.out.println("Not an Armstrong no");
    }
}