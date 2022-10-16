import java.util.*;
class S1
{ 
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string");
  String s=sc.nextLine();
  int i=0,p=0;
  String wd="";
  s=s+" ";
  for(i=0;i<s.length();i++)
  {
   char ch=s.charAt(i);
   if(ch==' ')
   {
    wd=s.substring(p,i);
    p=i+1;
    System.out.println(wd+"\t"+wd.length());
    }
   }
  }
}
  