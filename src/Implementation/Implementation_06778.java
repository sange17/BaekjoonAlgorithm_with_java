package Implementation;

import java.util.Scanner;

// 문제를 잘 읽자...
public class Implementation_06778 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int antennas = sc.nextInt();
		int eyes = sc.nextInt();
		
		if(antennas >= 3 && eyes <= 4) {
			sb.append("TroyMartian\n");
		}
		
		if(antennas <= 6 && eyes >= 2) {
			sb.append("VladSaturnian\n");
		}
		
		if(antennas <= 2 && eyes <= 3) {
			sb.append("GraemeMercurian\n");
		}
		
		System.out.println(sb);
		sc.close();
	}
}
