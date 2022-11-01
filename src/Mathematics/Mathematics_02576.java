package Mathematics;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Mathematics_02576 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		int sum = 0;
		int min = 100;
		for(int i = 0; i < 7; i++) {
			
			num = Integer.parseInt(br.readLine());
			
			if(num % 2 != 0) {
				
				sum += num;
				
				if(min > num) {
					min = num;
				}
			}else {
				continue;
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum + "\n" + min);
		}
		
	}
}
