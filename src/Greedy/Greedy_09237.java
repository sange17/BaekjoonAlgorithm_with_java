package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

// 나무가 모두 성장하는 날을 알아내는 문제
// 주의할 점은 나무를 사는 날 1일도 함께 계산할 것

//나무 성장일 내림차순 정렬 
// 39 39 38 35 20 9

// 나무를 산날				1
// 39					2
// 38 39				3
// 37 38 38				4
// 36 37 37 35			5
// 35 36 36 34 20		6
// 34 35 35 33 19 9		7

//가장 오래 성장할 나무 찾고 합계에 더하기

public class Greedy_09237 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Integer[] treeArray = new Integer[N];
		
		
		// 나무를 다 심었을 경우 가장 오래 걸리는 나무의 성장일을 더할 것
		int growthDay = 1 + N;		// 나무를 산 날(1일)과 나무를 모두 심은 날 수를 더한 값
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			treeArray[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(treeArray, Collections.reverseOrder());
		
		for(int i = 0; i < N; i++) {
			treeArray[i] -= N - i - 1;		// 하나의 나무를 심으면서 소요되는 다른 나무의 성장일 계산하기
		}
		
		// 나무를 모두 심은 후 성장일이 가장 많이 남은 나무 찾기
		int max = 0;
		for(int i = 0; i < N; i++) {
			if(max < treeArray[i])
				max = treeArray[i];
		}
		
		// growthDay(나무 산 날(1일) + 나무를 모두 심은 날(N일)) + 나무를 심은 후 가장 늦게 성장하는 나무의 성장일(max)
		growthDay += max;
		System.out.println(growthDay);
		br.close();
	}
}
