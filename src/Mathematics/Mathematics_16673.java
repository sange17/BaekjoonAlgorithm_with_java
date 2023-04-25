package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_16673 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int C = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int sum = 0;
		
		for(int c = 1; c <= C; c++) {
			
			sum += ((K * c) + (P * c * c));
		}
		
		System.out.println(sum);
		br.close();
	}
}
