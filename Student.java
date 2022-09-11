import java.util.*;
public class Student 
{
 int rollno;
 String name;
 int age;
 double marks1;
 double marks2;
 double avg;
 char grade;
private static String nextLine;
 public Student(int r,String n,int a,double m1,double m2)
 {
     rollno=r;
     name=n;
     age=a;
     marks1=m1;
     marks2=m2;
 }  
    public void Calavg()
    {
        avg=(marks1+marks2)/2;
    }  
    public void Calgrade()
    {
        if(avg<40)
        grade='C';
        else if(avg>=40 && avg<75)
        grade='B';
        else
        grade='A';
    }
    public void display()
    {
        System.out.println("The roll no is"+rollno);
        System.out.println("The name is"+name);
        System.out.println("The age is"+age);
        System.out.println("The marks1 is"+marks1);
        System.out.println("The marks2 is"+marks2);
        System.out.println("The average is"+avg);
        System.out.println("The grade is"+grade);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rollno");
        int r=sc.nextInt();
        System.out.println("Enter the age");
        int a=sc.nextInt();
        System.out.println("Enter both the marks");
        double m1=sc.nextDouble();
        double m2=sc.nextDouble();
        System.out.println("Enter the name");
        String n=nextLine;
        Student ob=new Student(r,n,a,m1,m2);
        ob.Calavg();
        ob.Calgrade();
        ob.display();
    }
}
