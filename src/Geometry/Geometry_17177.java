package Geometry;

import java.util.Scanner;

public class Geometry_17177 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int r1 = a * a - b * b;
		int r2 = a * a - c * c;
		double d = (Math.sqrt(r1 * r2) - b * c) / a;
		
		System.out.println(d > 0 ? (int) d : -1);
		
		sc.close();
	}
}
