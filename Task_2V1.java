package version_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2V1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String regex = scan.nextLine();
		String input = scan.nextLine();
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		int count = 0;
		while (matcher.find()) {
			count++;
		}
		System.out.println(count);
	}

}
