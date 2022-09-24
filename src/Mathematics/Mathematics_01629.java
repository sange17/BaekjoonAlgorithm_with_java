package Mathematics;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

// long형 변수의 범위를 생각하고 문제를 풀 것
// long: 9,223,372,036,854,775,807 (2^63-1)
// 모듈러 연산을 사용하여 long형 변수의 범위를 넘지 않게 한다.
// 모듈러 연산: (a * b) % c = (a % c * b % c) % c
public class Mathematics_01629 {
	
	static long A, B, C;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		A = Long.parseLong(st.nextToken());		// 밑
		B = Long.parseLong(st.nextToken());		// 지수
		C = Long.parseLong(st.nextToken());		// 나누는 수
		
		System.out.println(pow(A, B));
		br.close();
	}
	
	public static long pow(long A, long B) {
		
		// 지수(B)가 1인 경우는 A^1 리턴
		if(B == 1) return A % C;
		
		// 지수(B)을 절반으로 분할하여 그 지수를 사용한 값을 구한다.
		long temp = pow(A, B / 2);
		
		// 지수가 홀수인 경우
		// A^(B / 2) * A^(B / 2) * A의 식으로 구하게 되어 짝수 계산과 달리 A를 한번 더 곱해준다.
		if(B % 2 == 1) return (temp * temp % C) * A % C;
		
		// 지수가 짝수인 경우
		else return temp * temp % C;
	}
}
