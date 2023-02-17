package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mathematics_05355 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		double num = 0.0;
		String operator;
		
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			num = Double.parseDouble(st.nextToken());
			
			while(st.hasMoreTokens()) {
				
				operator = st.nextToken();
				
				if(operator.equals("@")) {
					num *= 3;
				}else if(operator.equals("%")) {
					num += 5;
				}else if(operator.equals("#")) {
					num -= 7;
				}
			}
			
			sb.append(String.format("%.2f", num) + "\n");
		}
		
		System.out.println(sb);
		br.close();
		
	}
}
