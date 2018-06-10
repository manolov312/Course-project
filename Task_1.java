package version_2;

import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row_1 = scan.nextLine();
		String row_2 = scan.nextLine();
		String [] firstRow = row_1.split(", ");
		String [] secondRow = row_2.split(", ");
		if (summing(firstRow) == summing(secondRow)) {
			System.out.println("SAME");
		} else {
			System.out.println("NOT SAME");
		}
	}
	private static int summing (String [] input) {
		int sum = 0;
		for (int i = 0 ; i < input.length ; i++) {
			int num = Integer.parseInt(input[i]);
			sum += num;
		}
		return sum;
	}

}
