package Mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class Mathematics_02587 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		int[] array = new int[5];
		
		for(int i = 0; i < 5; i++) {
			num = sc.nextInt();
			array[i] = num;
			sum += num;
		}
		
		Arrays.sort(array);
		
		System.out.println(sum / 5);
		System.out.println(array[2]);
	}
}
