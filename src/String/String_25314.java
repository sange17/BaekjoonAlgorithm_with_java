package String;

import java.util.Scanner;

public class String_25314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N / 4; i++) {
			
			sb.append("long ");
		}
		
		System.out.println(sb + "int");
		sc.close();
	}
}
