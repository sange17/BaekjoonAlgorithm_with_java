package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_06810 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 9 * 1 + 7 * 3 + 8 * 1 + 0 * 3 + 9 * 1 + 2 * 3 + 1 * 1 + 4 * 3 + 1 * 1 + 8 * 3;
		int checkNum = 1;
		int currentNum = 0;
		
		for(int i = 0; i < 3; i++) {
			
			currentNum = Integer.parseInt(br.readLine());
			
			num += (currentNum * checkNum);
			
			if(checkNum == 1) {
				checkNum = 3;
			}else if(checkNum == 3) {
				checkNum = 1;
			}
			
		}
		
		System.out.println("The 1-3-sum is " + num);
		br.close();
	}
}
