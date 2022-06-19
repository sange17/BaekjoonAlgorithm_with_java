package Mathematics;

import java.util.Scanner;
import java.util.Arrays;

public class Mathematics_13866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[4];
		
		for(int i = 0; i < 4; i++) {
			array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);
		
		int result = (array[0] + array[3])-(array[1] + array[2]);
		
		if(result < 0) {
			System.out.println(result * -1);
		}else {
			System.out.println(result);	
		}
	}
}
