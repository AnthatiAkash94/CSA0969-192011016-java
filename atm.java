import java.util.Scanner;
class atm
{
public static void main(String[] arg)
{
Scanner s=new Scanner(System.in);
int a,a1,b,b1,c,c1,d,d1,x;
System.out.println("enter the 1st denomination");
a=s.nextInt();
System.out.println("enter the 1st denomination notes");
a1=s.nextInt();
System.out.println("enter the 2nd denomination");
b=s.nextInt();
System.out.println("enter the 2nd denomination notes");
b1=s.nextInt();
System.out.println("enter the 3 rd denomination");
c=s.nextInt();
System.out.println("enter the 3rd denomination notes");
c1=s.nextInt();
System.out.println("enter the 4th denomination");
d=s.nextInt();
System.out.println("enter the 4th denomination notes");
d1=s.nextInt();
x=((a*a1)+(b*b1)+(c*c1)+(d*d1));
System.out.println("total aval bal in atm:"+x);
}
}
