package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_10179 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		double price = 0.0;
		for(int i = 0; i < T; i++) {
			
			price = Double.parseDouble(br.readLine());
			
			price -= price * 20 / 100;
			
			sb.append("$" + String.format("%.2f", price) + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
