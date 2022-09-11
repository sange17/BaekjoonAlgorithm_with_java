package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_23795 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		int sum = 0;
		while(true) {
			num = Integer.parseInt(br.readLine());
			
			if(num == -1) break;
			
			sum += num;
		}
		
		System.out.println(sum);
	}
}
