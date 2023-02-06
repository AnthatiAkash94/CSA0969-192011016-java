import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string:");
String s=sc.nextLine();
StringBuffer num=new StringBuffer();
int len=s.length();
for(int i=(len-1);i>=0;i--)
{
num=num.append(s.charAt(i));
}
if(s.equalsIgnoreCase(num.toString()))
{
System.out.println(" a palindrome");
}
 else
 {
  System.out.println("not a palindrome");
 }
}
}