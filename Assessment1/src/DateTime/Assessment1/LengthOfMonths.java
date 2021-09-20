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
public class LengthOfMonths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LengthOfMonths lm =  new LengthOfMonths();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Year: ");
		int year = input.nextInt();
		
		int[] monthsAndDays = lm.daysInMonths(year);
		for(int i = 0; i < monthsAndDays.length; i+= 2) {
			System.out.println("For the year of:" + year + " " + Month.of(monthsAndDays[i]) + " had " + monthsAndDays[i+1]+ " days.");
		}
	}
	
	public int[] daysInMonths(int y) {
		LocalDate ld = LocalDate.ofYearDay(y, 1);
		// alternating values... month 1, days 31, month 2 , days 28...
		int[] monthDays = new int[24];
		int index = 0;
		Month m = ld.getMonth();
		Integer counter = 0;
		for(int i = 0; i < 12; i++) {
			while(m == ld.getMonth()) {
				ld = ld.plusDays(1);
				counter++;
			}
			monthDays[index++] = m.getValue();
			monthDays[index++] = counter.intValue();
			//System.out.println("For the year of:" + y + " " + m.toString() + " had " + counter + " days.");
			m = ld.getMonth();
			counter = 0;
		}
		return monthDays;
	}

}
