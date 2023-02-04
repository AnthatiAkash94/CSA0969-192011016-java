import java.util.Scanner;
class vowel
{
public static void main(String[]arg)
{
int vcount=0,ccount=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String str=sc.nextLine();
str=str.toLowerCase();
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='a'||str.charAt(i)=='i'||str.charAt(i)=='0'||str.charAt(i)=='u')
{
vcount++;
}
else
{
ccount++;
}
}
System.out.println("Num of vowels:"+vcount);
}
}