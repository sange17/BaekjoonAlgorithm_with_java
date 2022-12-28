package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Mathematics_19602 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int small = Integer.parseInt(br.readLine());
		int medium = Integer.parseInt(br.readLine());
		int large = Integer.parseInt(br.readLine());
		
		int result = 1 * small + 2 * medium + 3 * large;
		
		if(result >= 10) {
			System.out.println("happy");
		}else {
			System.out.println("sad");
		}
		
		br.close();
	}
}
