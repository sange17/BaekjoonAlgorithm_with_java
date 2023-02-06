package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_10178 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int c = 0;
		int v = 0;
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			c = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			
			sb.append("You get " + c / v + " piece(s) and your dad gets " + c % v + " piece(s).\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
