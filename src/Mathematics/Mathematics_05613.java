package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_05613 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char input;
		int num = 0;
		int result = 0;
		result = Integer.parseInt(br.readLine());
		while(true) {
			
			input = br.readLine().charAt(0);
			
			if(input == '=') {
				System.out.println(result);
				break;
			}
			
			num = Integer.parseInt(br.readLine());
			
			if(input == '+') {
				result += num;
			}else if(input == '-') {
				result -= num;
			}else if(input == '*') {
				result *= num;
			}else if(input == '/') {
				result /= num;
			}
		}
	}
}
