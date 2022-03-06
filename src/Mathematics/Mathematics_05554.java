package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Mathematics_05554 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		for(int i = 0; i < 4; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		
		int min = sum / 60;
		int sec = sum % 60;
		
		System.out.println(min);
		System.out.println(sec);
		br.close();
	}
}
