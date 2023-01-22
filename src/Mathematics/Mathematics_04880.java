package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Mathematics_04880 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int a1 = Integer.parseInt(st.nextToken());
			int a2 = Integer.parseInt(st.nextToken());
			int a3 = Integer.parseInt(st.nextToken());
					
			if(a1 == 0 && a2 == 0 && a3 == 0) {
				break;
			}
			
			if(a3 - a2 == a2 - a1) {
				sb.append("AP " + (a3 + (a3 - a2)) + "\n");
				continue;
			}
			
			if(a2 / a1 * a2 == a3) {
				sb.append("GP " + (a3 * (a3 / a2)) + "\n");
				continue;
			}
			
		}
		
		System.out.println(sb);
		br.close();
	}
}
