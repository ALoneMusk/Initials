import java.util.Scanner;
public class OddsAndEvens
{
	  
	  static Scanner input=new Scanner(System.in);
	  static String name;
	  static String choice;
	  static int compchoice;
	  static String Odd="Odd";
	  static String Even="Even";
	  static int comp;
	  static int player;
	  static String choose="";
 public static void main(String[] args) 
 {
	Start();
	choice();
	player();
	decision();
	calculate();
	}
 public static void Start()
 {
	 Double int1;
	 boolean bool=true;
	 System.out.println("Let us play a game of odds and evens.");
	 System.out.println("Please enter your name.");
	 name=input.nextLine();
	 try
	 {
		 int1=Double.parseDouble(name);
	 }
	 catch (NumberFormatException e)
	 {
		bool=false; 
	 }
	 if(bool)
	 {
		 System.out.println("Please enter a valid input");
		 Start();
	 }
	 else
	 {
		 System.out.println("Hello "+name+", which one do you choose? Odd or Even.");
     }
	 
 }
 public static String choice() 
 {
	 choose="";;
	 choice=input.nextLine();
     if(choice.equalsIgnoreCase(Odd))
     {
    	 System.out.println("Your choice is Odd.");
    	 choose="Odd";
      }
     else if(choice.equalsIgnoreCase(Even))
     {
    	 System.out.println("Your choice is Even");
    	 choose="Even";
     }
     else
     {
    	 System.out.println("Please enter a valid input");
    	 choice(); 
     }
	return choose;
 }
     public static int decision()
     {
    	 comp= (int) (Math.random()*5);
    	 System.out.println("The computer chose "+comp);
    	 return comp;
     }
     public static int player()
     {
    	 System.out.println("Enter a number between 1 to 5. ");
    	 player=input.nextInt();  
    	 return player;
     }
    public static void calculate()
    {
    	int sum=player+comp;
    	int result=sum%2;
    	if(result==0 & choose=="Even")
    	{
    		System.out.println("The result of the sum is even");
    		System.out.println("You won.");
    	}
    	else if(result!=0 & choose=="Odd")
    	{
    		System.out.println("The result of the sum is odd");
    		System.out.println("You won. ");
    	}
    	else
    	{
    		System.out.println("You lost.");
    	}
    	
    }
     {
    	 
	
}
 
}

