package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_05086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int num1 = 0;
		int num2 = 0;
		while(true) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());
			
			if(num1 == 0 && num2 == 0) break;
			
			if(num2 % num1 == 0) {		// 약수 판별
				sb.append("factor");
			}else if(num1 % num2 == 0) {	// 배수 판별
				sb.append("multiple");
			}else {		// 둘 다 아님
				sb.append("neither");
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
