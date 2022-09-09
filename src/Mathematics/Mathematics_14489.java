package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_14489 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(br.readLine());
		
		if(A >= C && B >= C) {
			System.out.println(A + B - C * 2);
		}else if(A < C && B / C >= 2) {
			System.out.println(A + B - C * 2);
		}else if(A / C >= 2 && B < C) {
			System.out.println(A + B - C * 2);
		}else if(A + B >= C * 2) {			// 두 통장의 잔고를 합쳐서 사는 경우도 포함
			System.out.println(A + B - C * 2);
		}else {
			System.out.println(A + B);
		}
		
		br.close();
	}
}
