/**
 * 
 */
package DateTime.Assessment1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 * @author Colin Bradshaw
 *
 */
public class Friday13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Friday13 fr = new Friday13();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Year: ");
		int year = input.nextInt();
		System.out.print("Enter the Month: ");
		int month = Month.valueOf(input.next().toUpperCase()).getValue();
		System.out.print("Enter the Day of the month: ");
		int day = input.nextInt();
		if(fr.isItThe13th(year, month, day)) {
			System.out.println("This is Friday the 13th");
		} else {
			System.out.println("This is NOT Friday the 13th");
		}
		
	}
	
	public boolean isItThe13th(int y, int m, int d) {
		LocalDate ld = LocalDate.of(y, m, d);
		if(ld.getDayOfWeek().getValue() == 5) {
			if(ld.getDayOfMonth() == 13) {
				return true;
			}
		}
		return false;
	}

}
