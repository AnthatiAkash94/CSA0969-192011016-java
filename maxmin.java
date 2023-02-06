import java.util.Scanner;
class maxmin
{
public static void main(String[] arg)
{
Scanner n=new Scanner(System.in);
int n=in.nextInt();
int[] array=new int[n];
for(int i=0;i<n;i++)
{
array[i]=in.nextInt();
int max=array[0];
}
for(int j=0;j<array.length();j++)
{
if(array[j]>max)
{
max=array[j];
}
System.out.println("maximum:"+max);
}
int min=array[0];
for(int s=0;array.length();s++)
{
if(array[s]<min)
{
min=array[s];
}
System.out.println("minimum"+min);
}
}
}

 