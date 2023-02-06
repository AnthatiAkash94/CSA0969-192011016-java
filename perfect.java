import java .util.Scanner;
class perfect
{
public static void main(String[] arg)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
try
{
int a=s.nextInt();
int i,x=0,j;
if(a==0)
{
System.out.println("the result is zero");
}
else if(a>0)
{
int b=0;
for(j=2;j<1000000;j++)
{
if(b<a)
x=1;
for(i=2;i<j;i++)
{
if(j%1==0)
{
x=x+i;
}
}
if(x==j)
{
System.out.print(","+j);
b=b+i;
}
}
}
else
{
System.out.println("invalid");
}
}
catch(Exception e)
{
System.out.println("invalid");
}
}
}