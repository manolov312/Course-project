package version_2;

import java.util.Scanner;

public class Task_2V2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String inputStr = scan.nextLine();
		String[] words = inputStr.split(" ");
		int maxLength = 0;
		for (int i = 0 ; i < words.length ; i++) {
			if(maxLength < words[i].length()) {
				maxLength = words[i].length();
			}
		}
		while (maxLength > 0) {
			for (int i = 0; i < words.length; i++) {
				if (maxLength == words[i].length()) {
					System.out.println(words[i]);
				}
			}
			maxLength --;
		}
	}

}
