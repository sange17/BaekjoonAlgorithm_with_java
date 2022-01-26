package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mathematics_02292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int bfFloor = 1;
		int afFloor = 1;
		int count = 1;
		int i = 1;
		
		while(true) {
			if(n == 1) break;
			
			bfFloor = afFloor;
			afFloor += 6 * i;
						
			if(n > bfFloor && n <= afFloor) {
				count++;
				break;
			}
			
			count++;
			i++;
		}
		System.out.println(count);
		br.close();
	}
}
