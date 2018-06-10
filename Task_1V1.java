package version_1;

import java.util.Scanner;

public class Task_1V1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String output = "YES" ;
		double min = - Double.MAX_VALUE ;
		String nextStr ;
		double next;
		while(true) {
			nextStr = scan.nextLine();
			if(nextStr.equals("END")) {
				break;
			} 
			next = Double.parseDouble(nextStr);
			if (next > min) {
				min = next ;
			} else {
				output = "NO";
				break;
			}
		}
		System.out.println(output);
	}

}
