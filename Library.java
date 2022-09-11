import java.util.*;
public class Library 
{
  int accnum;
  String title;
  String author;
  public void input()
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the title");
      title=sc.nextLine();
      System.out.println("Enter the account no");
      accnum=sc.nextInt();
      System.out.println("Enter the author");
      author=sc.nextLine();
  }    
    public void compute()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of days late");
        int n=sc.nextInt();
        int fine=n*2;
        System.out.println("The fine is"+fine);
    }
    public void display()
    {
        System.out.println("Accession Number \t Title \t Author");
        System.out.println(accnum+"\t"+title+"\t"+author);
    }
    public static void main(String args[])
    {
        Library ob=new Library();
        ob.input();
        ob.compute();
        ob.display();        
    }
}
