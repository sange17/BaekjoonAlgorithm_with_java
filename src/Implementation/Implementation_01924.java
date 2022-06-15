package Implementation;

import java.util.Scanner;

public class Implementation_01924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		sc.close();
		
		int[] monthLength = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		for(int i = 0; i < month - 1; i++) {
			day += monthLength[i];
		}
		
		System.out.println(dayOfWeek[day % 7]);
	}
}
