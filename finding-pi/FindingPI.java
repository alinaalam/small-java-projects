/*
 Find PI to the Nth Digit 
 - Enter a number and have the program generate 
 PI up to that many decimal places. Keep a limit 
 to how far the program will go.
*/

import java.lang.*;
import java.util.*;
import java.text.*;

public class FindingPI {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {

			System.out.print("Enter a number[0-20]: ");
			int number = scanner.nextInt();

			if(number < 0 || number > 20) {
				throw new Exception();
			}

			findPI(number);

		} catch (Exception e) {
			System.out.println("Need to enter a valid, non-negative number between 0-20");
		} finally {
			scanner.close();
		}
	}

	private static void findPI(int number) {

		String pattern = "";

		if(number > 0) {
			pattern = getDecimalPattern(number);
		}

		DecimalFormat decimalPattern = new DecimalFormat("#"+pattern);
		System.out.println(decimalPattern.format(Math.PI));
	}

	private static String getDecimalPattern(int number) {

		StringBuffer sb = new StringBuffer(".");

		for(int i=0; i<number; i++) {
			sb.append("0");
		}

		return sb.toString();
	}

}