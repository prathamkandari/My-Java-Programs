import java.util.*;
public class Employee 
{
 int empno;
 String name;
 int age;
 double basic;
 double hra;
 double da;
 double ta;
 double pf;
 double netpay;
 public Employee(int eno,String n,int a,double b)
 {
     empno=eno;
     name=n;
     age=a;
     basic=b;
 }   
 public void Calculate()
 {
     if(basic<=10000)
     hra=0.10*basic;
     else if(basic>10000 && basic<=20000)
     hra=0.15*basic;
     else if(basic>20000 && basic<=30000)
     hra=0.20*basic;
     else
     hra=0.25*basic;

     da=1.10*basic;
     ta=0.10*basic;
     pf=0.12*basic;
 }
    public void Calnetpay()
    {
        netpay=basic+hra+da+ta-pf;
    }
    public void display()
    {
        System.out.println("Employee no is"+empno);
        System.out.println("The name is"+name);
        System.out.println("The age is"+age);
        System.out.println("The netpay is"+netpay);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee no");
        int e=sc.nextInt();
        System.out.println("Enter the name");
        String n=sc.nextLine();
        System.out.println("Enter the age");
        int a=sc.nextInt();
        System.out.println("Enter the basic");
        double b=sc.nextDouble();
        Employee ob=new Employee(e,n,a,b);
        ob.Calculate();
        ob.Calnetpay();
        ob.display();
    }
}
