import java.io.*;
import java.util.*;

class splchar
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);   
String c = sc.nextLine();
int c1=0,c2=0,c3=0,c4=0;
if(character.isUppercase(c.charAt(0)))
{
c1++;
}
elseif(character.isLowercase(c.charAt(0)))
{
c2++;
}
elseif(character.isdigit(c.charAt(0)))
{
c3++;
}
else
{
System.out.println(c4);c4++;
System.out.println("total no of splchar:"+c4);
}
}
 