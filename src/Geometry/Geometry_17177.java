package Geometry;

import java.util.Scanner;

public class Geometry_17177 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int BC = sc.nextInt();
		int AB = sc.nextInt();
		int CD = sc.nextInt();
		
		double AC = Math.sqrt(Math.pow(BC, 2) - Math.pow(AB, 2));
		double BD = Math.sqrt(Math.pow(BC, 2) - Math.pow(CD, 2));
		
		double AD = ((AC * BD - AB * CD) / BC);
		
		if(AD <= 0) {
			System.out.println(-1);
		}else {
			System.out.println((int)Math.ceil(AD));
		}
	}
}
