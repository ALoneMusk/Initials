import java.util.*;
public class Travel
{
	static Scanner input=new Scanner(System.in);
	static String name;
	static String destination;
	static String currency;
	static double days;
	static double expense;
	static double TotalExpense;
	static double ExchangeRate;
	static double FinalExpense;
	static double intname1;
	static boolean tname1=true;
	static double intname2;
	static double intname3;
	static boolean tname2=true;
	static boolean tname3=true;
	public static void main(String[] args)
	{
		name();
		destination();
		days();
		currency();
		PerDayExpense();
		Result();
	}
	
	public static void name()
	{
		
		System.out.println("Enter your name. ");
		 name=input.nextLine();
	   try
	   {
		    intname1=Double.parseDouble(name);
	   }
	   catch (NumberFormatException e)
	   {
		   tname1 = false;
	   }
	   if (tname1)
	   {
		System.out.println("Please enter a valid name. ");
		name();
	   }
	   else
	   {
			System.out.println("Hello "+name+", welcome!");
			
	   }
	}
	public static void destination()
	{
	
		System.out.println("Enter your destination ");
		destination=input.nextLine();
		try
		{
			intname2=Double.parseDouble(destination);
			
		}
		catch (NumberFormatException e)
		{
			tname2=false;
		}
		if (tname2)
		{
		  	System.out.println("Please enter a valid destination");
	    	destination();	
		}
		else
		{
			System.out.println(destination+" is a good place to visit.");	
		}
	}
	public static void currency() 
	{
		System.out.println("Enter the currency used in "+destination);
	    currency=input.nextLine();
		try
		{
			intname3=Double.parseDouble(currency);
		}
		catch (NumberFormatException e)
		{
			tname3=false;
		}
		if (tname3)
		{
			System.out.println("Please enter valid currency");
			currency();
		
	    }
		else
		{
			System.out.println("Enter the exchange rate for "+currency+" in your currency.");
			ExchangeRate=input.nextDouble();
		}
		
		}
		
	public static void days()
	{
		System.out.println("Enter number of days. ");
		days=input.nextDouble();
		input.nextLine();
		System.out.println(+days+" is quite a long vacation.");
	}
	
	public static void PerDayExpense()
	{
		System.out.println("Enter your per day expense ");
		expense=input.nextDouble();
	}
	
	public static int calculate()
	{
		TotalExpense = days*expense;
		FinalExpense=TotalExpense*ExchangeRate;
		
		return (int) FinalExpense;
		
			
	}
	public static void Result()
	{
		calculate();
		System.out.println("Your total expense for your "+days+" days stay in "+destination+" is "+FinalExpense);
	}
	}
