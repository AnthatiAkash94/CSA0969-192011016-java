import java.util.Scanner;
class bonus
{
public static void main(String[] arg)
{
Scanner in=new Scanner(System.in);
System.out.println("enter the grade");
char ch=in.next().charAt(0);
if(ch=='A')
{
System.out.println("enter the salary");
int a=in.nextInt();
if(a<10000)
{
int bonus=a/7;
int total=a+bonus;
System.out.println("Bonus"+bonus);
System.out.println("total"+total);
}
else
{
int bonus=a/5;
int total=a+bonus;
System.out.println("Bonus"+bonus);
System.out.println("total"+total);
}
}
if(ch=='B')
{
System.out.println("enter the salary");
int b=in.nextInt();
if(b<10000)
{
int bonus=b/12;
int total=b+bonus;
System.out.println("Bonus"+bonus);
System.out.println("total"+total);
}
else{
int bonus=b/10;
int total=b+bonus;
System.out.println("Bonus"+bonus);
System.out.println("total"+total);
}
}
}
}


