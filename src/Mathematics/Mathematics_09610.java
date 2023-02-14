package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_09610 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int x = 0;
		int y = 0;
		int Q1 = 0;
		int Q2 = 0;
		int Q3 = 0;
		int Q4 = 0;
		int AXIS = 0;
		for(int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			if(x == 0 || y == 0) {
				AXIS++;
			}else if(x > 0 && y > 0) {
				Q1++;
			}else if(x < 0 && y > 0) {
				Q2++;
			}else if(x < 0 && y < 0) {
				Q3++;
			}else if(x > 0 && y < 0) {
				Q4++;
			}
		}
		
		System.out.println("Q1: " + Q1 + "\nQ2: " + Q2 + "\nQ3: " + Q3 + "\nQ4: " + Q4 + "\nAXIS: " + AXIS);
		br.close();
	}
}
