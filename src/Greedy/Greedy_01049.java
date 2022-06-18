package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Greedy_01049 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int min = Integer.MAX_VALUE;
		
		int[] unit = new int[M];
		int[] pack = new int[M];
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			pack[i] = Integer.parseInt(st.nextToken());
			unit[i] = Integer.parseInt(st.nextToken());
		}
		
		// 가장 싼 값을 고르기 위해 정렬
		Arrays.sort(unit);
		Arrays.sort(pack);
		
		// 가장 싼 6개짜리 팩으로만 구매한 값과 가장 싼 낱개로만 구매한 값을 
		// 비교해서 최솟값을 구한다.
		min = Math.min(((N / 6) + 1) * pack[0], N * unit[0]);
		// 위의 결과와 가장 싼 6개짜리 팩 가격 + 가장 싼 낱개 가격을 
		// 비교해서 최솟값을 구한다.
		min = Math.min(min, ((N / 6)) * pack[0] + (N % 6) * unit[0]);
		
		System.out.println(min);
		br.close();
		
	}
}
