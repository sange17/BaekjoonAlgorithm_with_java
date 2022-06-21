// 로프의 종류가 아무리 다양하더라도
// 병렬로 연결되어 있다면 최저 중량을 기준으로 
// 들 수 있는 무게가 정해진다
// 예를 들어  13 10 7 20 이렇게 네 로프가 있다면
// 제일 작은 7을 기준으로 볼 때 들 수 있는 최대 중량은  7 * 4가 된다.
// 중량을 더 버틸 수 있는 로프가 있지만 7을 기준으로 하향평준화 되는 느낌이다.
// 그렇다면 최대중량은 어떻게 구하면 될까?
// 최대중량은 로프 중량 N개의 인덱스를 가진 배열을 정렬해서 가장 잘 버티는 로프부터
// 인덱스를 하나씩 거꾸로 이동하며 (현재 위치한 인덱스의 로프 중량 * 총 로프의 개수)를 계산하고 
// 이전에 계산한 값보다 크다면 그것이 최대중량이 된다.
// 다시 위의 예를 보면 13 10 7 20을 정렬해서 7 10 13 20을 얻고
// 배열의 뒷 부분. 즉, 큰 수부터 (현재 위치한 인덱스의 로프 중량 * 총 로프의 개수)를 계산하여
// 다양한 종류의 로프가 병렬 연결 되었을 때 최대로 버틸 수 있는 최대 중량을 구할 수 있다.

package Greedy;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;

public class Greedy_02217 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] array = new int[N];
		
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(array);
		
		int max = 0;
		for(int i = 1; i <= N; i++) {
			max = Math.max(array[N-i] * i, max);
		}
		
		System.out.println(max);
	}
}
