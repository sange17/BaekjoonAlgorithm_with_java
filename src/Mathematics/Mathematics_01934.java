package Mathematics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mathematics_01934 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String array[] = new String[2];
		int a, b, large;
		int min = 1;
		int max = 1;
		
		for(int j = 0; j < n; j++) {
			array = br.readLine().split(" ");
			a = Integer.parseInt(array[0]);
			b = Integer.parseInt(array[1]);
			large = a > b ? a : b;
			
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
			
			System.out.println(max);
			min = 1;
		}
	}
}
