package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Greedy_11497 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			int[] arrayA = new int[N];
			int[] arrayB = new int[N];
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < N; j++) {
				arrayA[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arrayA);
			
			int left = 0;
			int right = N - 1;
			
			for(int j = 0; j < N; j++) {
				
				if(j % 2 == 0) {		// 인덱스가 짝수인 경우
					arrayB[right] = arrayA[j];			// 배열 오른쪽에 담기
					right -= 1;
				}else {					// 인덱스가 홀수인 경우
					arrayB[left] = arrayA[j];			// 배열 왼쪽에 담기
					left += 1;
				}
			}
			
			// 배열이 원형으로 이루어졌다고 보고 첫 인덱스 - 마지막 인덱스 값을 구해준다.
			int answer = Math.abs(arrayB[0] - arrayB[N - 1]);
			// 다음 반복은 현재 인덱스와 다음 인덱스의 차를 구해준다.
			for(int j = 1; j < N; j++) {
				answer = Math.max(answer, Math.abs(arrayB[j] - arrayB[j - 1]));
			}
			
			sb.append(answer + "\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
