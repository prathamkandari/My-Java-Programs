import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int i=0;
        for(i=0;i<a.length;i++)
        {
            System.out.println("Enter a no");
            a[i]=sc.nextInt();
        }
        for(i=a.length-1;i>=0;i--)
        System.out.print(a[i]+" ");    
    }
}