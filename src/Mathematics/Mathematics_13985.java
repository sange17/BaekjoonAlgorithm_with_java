package Mathematics;

import java.util.Scanner;

public class Mathematics_13985 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String[] array = str.split(" ");
		
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[2]);
		int c = Integer.parseInt(array[4]); 
		
		if(a + b == c) 
			System.out.println("YES");
		else {
			System.out.println("NO");
		}
		
		sc.close();
	}
}
