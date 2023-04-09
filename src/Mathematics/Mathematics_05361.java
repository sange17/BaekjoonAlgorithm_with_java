package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_05361 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		double sum;
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			sum = 0;
				
			sum = Integer.parseInt(st.nextToken()) * 350.34
				+ Integer.parseInt(st.nextToken()) * 230.90
				+ Integer.parseInt(st.nextToken()) * 190.55
				+ Integer.parseInt(st.nextToken()) * 125.30
				+ Integer.parseInt(st.nextToken()) * 180.90;
			
			sb.append("$" + String.format("%.2f", sum) + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
