import java.util.Scanner;
class pyramid
{
public static void main(String[] arg)
{
int i,j,n;
Scanner s=new Scanner(System.in);
System.out.println("enter the value:");
int x=s.nextInt();
System.out.println("input the maximum number of time");
n=s.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<i;j++)
{
System.out.print(x+" ");
}
System.out.println();
}
for(i=0;i<=n;i++)
{
for(j=n;j>i;j--)
{
System.out.print(x+" ");
}
System.out.println();
}
}
}