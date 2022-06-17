package Greedy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Greedy_02864 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] array = sc.nextLine().split(" ");
		
		String A = array[0];
		String B = array[1];
		
		int A_MAX = Integer.parseInt(A.replace("5", "6"));
		int B_MAX = Integer.parseInt(B.replace("5", "6"));
		int A_MIN = Integer.parseInt(A.replace("6", "5"));
		int B_MIN = Integer.parseInt(B.replace("6", "5"));
		
		System.out.println((A_MIN + B_MIN) + " " + (A_MAX + B_MAX));
		sc.close();
	}
}
