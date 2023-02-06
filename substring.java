import java.util.Scanner;
class substring
{
public static void main(String arg[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a string:");
String a=sc.nextLine();
System.out.println(a.substring(2,10));
System.out.println(a.substring(0));
}
}