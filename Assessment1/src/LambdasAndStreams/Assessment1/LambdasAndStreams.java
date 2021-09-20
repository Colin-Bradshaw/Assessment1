package LambdasAndStreams.Assessment1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */

/**
 * @author Colin Bradshaw
 *
 */
public class LambdasAndStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("---------------------------------------Part 1---------------------------------------");
		List<String> walrus = Arrays.asList("Goo goo g' joob", "Sitting on a cornflake", "Waiting for the van to come",
				"Corporation tee shirt", "Stupid bloody Tuesday", "Man, you been a naughty boy", "You let your face grow long");
		List<Integer> evenAndOdd = Arrays.asList(1, 2, 3, 5, 88, 123);
		List<String> stringList = Arrays.asList("a23", "555", "666", "a234");
		
		System.out.println("Shortest to longest\n------------------------------");
		Comparator<String> comp = (str1, str2) -> str1.length() - str2.length();
		walrus.stream().sorted(comp).collect(Collectors.toList()).forEach((value) -> System.out.println(value));
		
		System.out.println("\nLongest to shortest\n-----------------------------");
		comp = (str1, str2) -> (str1.length() - str2.length()) * -1;
		walrus.stream().sorted(comp).collect(Collectors.toList()).forEach((value) -> System.out.println(value));
		
		System.out.println("\nAlphabetically by first character\n-----------------------------");
		comp = (str1, str2) -> (str1.charAt(0) - str2.charAt(0));
		walrus.stream().sorted(comp).collect(Collectors.toList()).forEach((value) -> System.out.println(value));
		
		System.out.println("\nContaining 'e' first\n-----------------------------");
		comp = (str1, str2) -> {
			if(str1.toLowerCase().contains("e") && str2.toLowerCase().contains("e")) {
				return 0;
			} else if (str1.toLowerCase().contains("e")){
				return -1;
			} else if (str2.toLowerCase().contains("e")) {
				return 1;
			}
			return 0;
		};
		
		walrus.stream().sorted(comp).collect(Collectors.toList()).forEach((value) -> System.out.println(value));
		
		System.out.println("\nSame as above, but with static helper method\n-----------------------------");
		
		//I am using a Collection rather than an array...
		Collections.sort(walrus, (s1,s2) -> stringSortHelper(s1,s2));
		for(String s: walrus) {
			System.out.println(s);
		}

		System.out.println("---------------------------------------Part 2---------------------------------------");
		
		System.out.println("\nEven/Odd appended list of numbers\n-----------------------------");
		StringBuilder st = new StringBuilder();
		evenAndOdd.forEach((n) -> {
			if(n%2 == 0) {
				st.append('e').append(n).append(',');
			} else {
				st.append('o').append(n).append(',');
			}
		});
		System.out.println(st);
		
		System.out.println("\nFiltered list of Strings\n-----------------------------");
		stringList.stream().filter(aString -> aString.length() == 3)
				.filter(aString -> aString.charAt(0) == 'a')
				.collect(Collectors.toList())
				.forEach(aString -> System.out.println(aString));
		
	}
	
	public static <T> int stringSortHelper(T s1, T s2) {
		if(((String) s1).toLowerCase().contains("e")&& ((String) s2).toLowerCase().contains("e")) {
			return 0;
		} else if (((String) s1).toLowerCase().contains("e")){
			return -1;
		} else if (((String) s2).toLowerCase().contains("e")) {
			return 1;
		}
		return 0;
	}

}
