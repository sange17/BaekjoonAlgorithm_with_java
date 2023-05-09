package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_15953 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		int a = 0;
		int b = 0;
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			int sum = 0;
			
			if(a == 0) {
				sum += 0;
			}else if(a == 1){
				sum += 5000000;
			}else if(a > 1 && a <= 3) {
				sum += 3000000;
			}else if(a > 3 && a <= 6) {
				sum += 2000000;
			}else if(a > 6 && a <= 10) {
				sum += 500000;
			}else if(a > 10 && a <= 15) {
				sum += 300000;
			}else if(a > 15 && a <= 21) {
				sum += 100000;
			}
			
			if(b == 0) {
				sum += 0;
			}else if(b == 1){
				sum += 5120000;
			}else if(b > 1 && b <= 3) {
				sum += 2560000;
			}else if(b > 3 && b <= 7) {
				sum += 1280000;
			}else if(b > 7 && b <= 15) {
				sum += 640000;
			}else if(b > 15 && b <= 31) {
				sum += 320000;
			}
			
			sb.append(sum + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
