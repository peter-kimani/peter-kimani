import java.util.*;
public class Welcome{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
String gender;
gender=male;
male=true;
String name;

System.out.print("Enter your name:");
name=input.next();
System.out.println("Enter your gender:");
gender=input.next().toLowerCase();	
}
if(gender=male){
	System.out.print("Hello Mr"+""+name);
	}
	else 
	{
		System.out.print("Hello Mrs"+""+name);
	}
	else
	{
		System.out.println("Dear esteemed Client," + "your gender user name are invalid try again.");
	}
}
}