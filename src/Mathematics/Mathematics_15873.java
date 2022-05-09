package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mathematics_15873 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int sum = 0;
		
		if(num < 100) {
			sum += num / 10;
			sum += num % 10;
			System.out.println(sum);
		}else if(num % 100 == 10) {
			sum += num / 100;
			sum += num % 100;
			System.out.println(sum);
		}else if(num / 100 == 1 && num % 100 < 10) {
			sum += num / 10;
			sum += num % 10;
			System.out.println(sum);
		}else if(num % 1000 == 10 && num / 1000 == 1) {
			sum += num / 100;
			sum += num % 1000;
			System.out.println(sum);
		}
		
		br.close();
		
	}
}
