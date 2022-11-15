package Implementation;

import java.util.Scanner;

public class Implementation_04999 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String firstLine = sc.next();
		String secondLine = sc.next();
		
		if(firstLine.length() < secondLine.length()) {
			System.out.println("no");
		}else {
			System.out.println("go");
		}
		
		sc.close();
	}
}
