package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// 평소대로 Math.pow 메소드나 반복문을 이용한 제곱 계산을 하면 틀린다.
// 숫자를 제곱할 떄 규칙을 찾고 일의 자리 숫자만 계속 계산하며 풀 수 있다.
public class Mathematics_01009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int data = 1;
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a % 10 == 0) {
				data = 10;
			}else {
				for(int j = 0; j < b; j++) {
					
					data *= a;
					data %= 10;
				}
			}
			
			sb.append(data + "\n");
			
			data = 1;
		}
		
		System.out.println(sb);
		br.close();
	}
}
