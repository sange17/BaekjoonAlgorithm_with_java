package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mathematics_02609 {
	public static void main(String[] atgs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String array[] = new String[2];
		array = br.readLine().split(" ");
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		int large = a > b ? a : b;
		int min = 1;
		int max = 1;
		
	
		for(int i = 2; i <= large; i++) {
			if(a % i == 0 && b % i == 0) {
				min = i;
			}
		}
		
		if(min == 1) {
			max = a * b;
		}else {
			max = a / min * b / min * min;			
		}
				
		System.out.println(min);
		System.out.println(max);
	}
}
