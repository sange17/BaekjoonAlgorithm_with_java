package Mathematics;

import java.util.Scanner;

public class Mathematics_01212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine();
		
		int octalToDecimal = Integer.parseInt(n, 8);
		String decimalToBinary = Integer.toBinaryString(octalToDecimal);
		
		System.out.println(decimalToBinary);
	}
}
