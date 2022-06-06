package Geometry;

import java.util.Scanner;

public class Geometry_14264 {
	public static void main(String[] arsg) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		
		double result = Math.sqrt((Math.pow(2*L, 2) - Math.pow(L, 2))) * L / 2 / 2;
		
		System.out.println(result);
	}
}
