import java.util.*;
class S2
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string");
  String s=sc.nextLine();
  int i=0,p=0,j=0,c=0;
  String wd="";
  s=s+" ";
  for(i=0;i<s.length();i++)
  {
   char ch=s.charAt(i);
   if(ch==' ')
   {
    wd=s.substring(p,i);
    p=i+1;
    c=0;
    for(j=0;j<wd.length();j++)
    {
     ch=wd.charAt(j);
     if(ch!='A' && ch!='a' && ch!='E' && ch!='e' && ch!='I' && ch!='i' && ch!='O' && ch!='o' && ch!='U' && ch!='u')
     c++;
     }
    System.out.println(wd+" "+c);
    }
   }
  }
}