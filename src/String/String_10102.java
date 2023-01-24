package String;

import java.util.Scanner;

public class String_10102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt();
		String str = sc.next();
		int countA = 0;
		int countB = 0;
		
		for(int i = 0; i < V; i++) {
			
			if(str.charAt(i) == 'A') {
				countA++;
			}else {
				countB++;
			}
		}
		
		if(countA > countB) {
			System.out.println('A');
		}else if(countA < countB) {
			System.out.println('B');
		}else {
			System.out.println("Tie");
		}
		
		sc.close();
	}
}
