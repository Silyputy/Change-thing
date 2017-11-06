import static java.lang.System.out;
import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class change {
	
	public static void main(String args[]){
		
		
		Scanner keyboard = new Scanner(System.in);
		out.println("Please enter a number.");
		BigDecimal numberenterd = keyboard.nextBigDecimal();
		BigDecimal twenty = new BigDecimal(20);
		BigDecimal ten = new BigDecimal(10);
		BigDecimal five = new BigDecimal(5);
		BigDecimal two = new BigDecimal(2);
		BigDecimal one = new BigDecimal(1);
		BigDecimal quarter = new BigDecimal(".25");
		BigDecimal dime = new BigDecimal(".10");
		BigDecimal nickle = new BigDecimal(".05");
		BigDecimal left = new BigDecimal(0);
				
		if(numberenterd.doubleValue() >= 20){
			BigDecimal btwenty = numberenterd.divide(twenty);
			out.println();
			out.println(left.toBigInteger());
		}
		
		
		
		
	keyboard.close();
	}
}
