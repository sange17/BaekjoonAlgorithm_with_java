package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_11948 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for(int i = 0; i < 4; i++) {
			int a = Integer.parseInt(br.readLine());
			sum += a;
			if(min > a) {
				min = a;
			}
		}
		sum -= min;
		
		min = Integer.MAX_VALUE;
		for(int i = 0; i < 2; i++) {
			int b = Integer.parseInt(br.readLine());
			sum += b;
			if(min > b) {
				min = b;
			}
		}
		sum -= min;
		
		System.out.println(sum);
		br.close();
	}
}
