package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_25238 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		
		if(b > 0) {
			
			if(a - (a * b / 100) >= 100) {
				System.out.println(0);
			}else {
				System.out.println(1);
			}
			
		}else {
			
			if(a >= 100) {
				System.out.println(0);
			}else {
				System.out.println(1);
			}
		}
		
		br.close();
	}
}
