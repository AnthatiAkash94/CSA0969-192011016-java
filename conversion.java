import java.util.Scanner;
class conversion
{
public static void main(String[] arg)
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
int decimal=s.nextInt();
String binary=Integer.toBinaryString(decimal);
System.out.println("binary is :"+binary);
System.out.print("octal is ");
System.out.println(Integer.toOctalString(decimal));
}
}
