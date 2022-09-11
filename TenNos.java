import java.util.*;
class TenNos
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
        for(i=0;i<a.length;i++)
        System.out.print(a[i]+" ");    
    }
}