import java.util.Scanner;

import static java.lang.System.out;

public class Good {
	
	public static void main(String args[]){		
		Scanner keyboard = new Scanner(System.in);
		out.println("Please input a number!");
		String input = keyboard.next();
		keyboard.close();
		try {
			int left = (int) (Double.parseDouble(input) * 100);
			int twentie,ten,five,two,one,quarter,dime,nickle,r = 0;
			
			twentie = ((int) left / 2000);
			if(twentie >= 1){
				out.println(twentie + ", twentie dollar bills owed.");
				r = (left % 2000);
				left = r;
			}
			
			ten = ((int) left / 1000);
			if(ten >= 1){
				out.println(ten + ", ten dollar bills owed.");
				r = (left % 1000);
				left = r;
			}
			
			five = ((int) left / 500);
			if(five >= 1){
				out.println(five + ", five dollar bills owed.");
				r = (left % 500);
				left = r;
			}
			
			two = ((int) left / 200);
			if(two >= 1){
				out.println(two + ", toonies owed.");
				r = (left % 200);
				left = r;
			}
			
			one = ((int) left / 100);
			if(one >= 1){
				out.println(one + ", loonies owed.");
				r = (left % 100);
				left = r;
			}
			
			quarter = ((int) left / 25);
			if(quarter >= 1){
				out.println(quarter + ", quarters owed.");
				r = (left % 25);
				left = r;
			}
			
			dime = ((int) left / 10);
			if(dime >= 1){
				out.println(dime + ", dimes owned");
				r = (left % 10);
				left = r;
			}
			
			nickle = ((int) left / 5);
			if(nickle >= 1){
				r = (left % 5);
				left = r;
			}
			if(left >= .03){
				nickle++;
			}
			if(nickle >= 1){
			out.println(nickle + ", nickles owed");
			}	
		} catch(NumberFormatException e){
			out.println("Not a valid number");
		}
	}
}
