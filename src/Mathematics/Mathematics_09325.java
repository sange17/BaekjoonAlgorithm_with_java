package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_09325 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int carPrice = 0;
		int n = 0;
		int q = 0;
		int p = 0;
		for(int i = 0; i < T; i++) {
			
			carPrice = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			
			for(int j = 0; j < n; j++) {
				
				st = new StringTokenizer(br.readLine(), " ");
				
				q = Integer.parseInt(st.nextToken());
				p = Integer.parseInt(st.nextToken());
				
				carPrice += (q * p);
			}
			
			sb.append(carPrice + "\n");
			carPrice = 0;
		}
		
		System.out.println(sb);
		br.close();
	}
}
