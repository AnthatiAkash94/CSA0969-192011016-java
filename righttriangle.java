import java.util.Scanner;
class righttriangle
{
public static void main(String[] arg)
{
Scanner s=new Scanner(System.in);
System.out.println("input the number of rows:");
int n=s.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print("* ");
}
System.out.println();
}
s.close();
}
}