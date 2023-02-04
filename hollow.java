import java.util.Scanner;
class  hollow
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int side;
System.out.print("enter the side:");
side=sc.nextInt();
for(int i=0;i<side;i++)
{
for(int j=0;j<side;j++)
{
if(i==0 || i==side-1 || j==0 || j==side-1)
{
System.out.print("*");
}
else{
System.out.print(" ");
}
}
System.out.println();
}
}
}
