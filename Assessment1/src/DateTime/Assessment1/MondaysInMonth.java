/**
 * 
 */
package DateTime.Assessment1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Colin Bradshaw
 *
 */
public class MondaysInMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MondaysInMonth mon = new MondaysInMonth();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the month you would like to know the Mondays in: ");
		String month = input.next().toUpperCase();
		Month m = Month.valueOf(month);
		// get current LocalDate
		LocalDate ld = LocalDate.now();
		
		// modify month and Day
		ld = ld.withMonth(m.getValue());
		ld = ld.withDayOfMonth(1);
		Integer[] mondays = mon.isMonday(ld.getYear(), m.getValue(), 1);
		for(int i = 0; i < mondays.length; i+=3) {
			System.out.println(mondays[i] + "-" + mondays[i+1] + "-" + mondays[i+2]);
		}

	}
	
	
	// pass in ints and return String to keep loosely coupled
		public Integer[] isMonday(int y, int m, int d) {
			LocalDate ld = LocalDate.of(y, m, d);
			ArrayList<Integer> ret = new ArrayList<Integer>();
			
			for(int i = 0; i < ld.getMonth().maxLength(); i++) {
				if(ld.getDayOfWeek().getValue() == 1 && ld.getMonth().getValue() == m) {
					ret.add(ld.getYear());
					ret.add(ld.getMonth().getValue());
					ret.add(ld.getDayOfMonth());
				}
				ld = ld.plusDays(1);
			}
			Integer[] toReturn = new Integer[ret.size()];
			return ret.toArray(toReturn);
		}

}
