import java.util.Scanner ;
class decimaltobinary
{
public static void main(String[]arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter decimal number:");
int decimal=sc.nextInt();
String binary=Integer.toBinaryString(decimal);
System.out.println("binary number:"+binary);
String octal=Integer.toOctalString(decimal);
System.out.println("octal number:"+octal);
}
}

