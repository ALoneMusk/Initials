import java.util.*;
public class Caesar
{
static Scanner input = new Scanner(System.in);
static String name;
static String NAME;
static int c;
static int num;
static char character;
static int length;

public static void main(String args[])
{
input();
convert();
check();
}
public static String input()
{
System.out.println("Enter a string");
name=input.nextLine();
NAME=name.toUpperCase();
return NAME;
}
public static void convert()
{
System.out.println(NAME);
 length=NAME.length();
for(int i=0; i<length; i++)
{
 c=NAME.charAt(i);
num = (int) c;
check();
}
}
public static void check()
{
	for(int l=65; l<=90; l++)
	{
		if(num==l)
		{
			character = (char) c;
			add();
		}
	}
}
public static void add()
{
	System.out.print(character);
}
}