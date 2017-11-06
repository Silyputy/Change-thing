import java.util.Scanner;
import static java.lang.System.out;


public class wow {
	
	public static void main(String args[]){
		
		Scanner keyboard = new Scanner(System.in);
		out.println("Enter a number");
		double left = keyboard.nextDouble();
		int twentie = 0;
		int ten = 0;
		int five = 0;
		int two = 0;
		int one = 0;
		int quarter = 0;
		int dime = 0;
		int nickle = 0;
		
		
		while( left >= 20){
			twentie++;			
			double random = (left - 20);
			left = random;
		}		
		while( left >= 10){
			ten++;
			double random = (left - 10);
			left = random;
		}
		while( left >= 5){
			five++;
			double random = (left - 5);
			left = random;
		}
		while( left >= 2){
			two++;
			double random = (left - 2);
			left = random;
		}
		while( left >= 1){
			one++;
			double random = (left - 1);
			left = random;
		}
		while( left >= .25){
			quarter++;
			double random = (left - .25);
			left = random;
		}
		while( left >= .10){
			dime++;
			double random = (left - .10);
			left = random;
		}
		while( left >= .05){
			nickle++;
			double random = (left - .05);
			left = random;
		}
		if(left >= .03){
			nickle++;
		}
		
		if(twentie > 0){
			out.println(twentie + ", 20 dollar bills are owed.");
		}
		if(ten > 0){
			out.println(ten + ", 10 dollar bills are owed.");
		}
		if(five > 0){
			out.println(five + ", 5 dollar bills are owed.");
		}
		if(two > 0){
			out.println(two + ", toonies are owed.");
		}
		if(one > 0){
			out.println(one + ", loonies are owed.");
		}
		if(quarter > 0){
			out.println(quarter + ", quarters are owed.");
		}
		if(dime > 0){
			out.println(dime + ", dimes are owed.");
		}
		if(nickle > 0){
			out.println(nickle + ", nickles are owed.");
		}
		keyboard.close();	
	}

}
