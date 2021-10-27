/**
 * 
 */
import java.util.*;
/**
 * @author bobby
 *
 */
public class Converter {
	
	public void convert() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//double amount;
		int currency1 = 0;
		int currency2 = 0;
		
		
		System.out.println("Enter 1 for US dollar.");
		currency1 = scan.nextInt();
		
		
		
		
		switch(currency1) {
		
		case 1: 
			break;
		default:
			System.out.println("You must enter 1");
			
		}
		
		
		System.out.println("Enter 1 for Rupee");
		currency2 = scan.nextInt();
		
		
		switch(currency2) {
		
		case 1:
			break;
		default:
			System.out.println("You must enter 1");
		}
		System.out.println("The currencies are converted");
	}
}
