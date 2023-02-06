import java.util.Scanner;
class hollow
{

public static void main(String[] args)
{
Scanner sc=new Scanner (System.in);
System.out.print("Enter hollow square side =  ");
int side=sc.nextInt();
System.out.println("Printing hollow square star pattern : ");
for (int i=0; i<side; i++)
{
for(int j=0; j<side; ++j)
{
if(i==0 || i==side-1 || j==0 || j==side-1)
{
System.out.println("*");
}
else
{
System.out.print(" ") ;
}
}
System.out.println(" " );
}
}
}