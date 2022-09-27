package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Greedy_02847 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		
		// O(N)
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		// O(logN)
		// 배열의 뒤 부터 차례대로 크기를 비교
		int count = 0;
		for(int i = N - 1; i >= 1; i--) {
			
			int currentNum = array[i];		// 현재 인덱스의 수
			int nextNum = array[i - 1];		// 다음 인덱스의 수
			
			// 현재 인덱스의 숫자보다 다음 숫자가 크다면 
			if(currentNum <= nextNum) {
				
				// (다음 숫자 == 현재 숫자 - 1)일 때까지 빼면 서 반복
				while(true) {
					
					if(nextNum == currentNum - 1) {
						break;
					}else {
						
						nextNum--;
						count++;
					}
				}
				
				array[i - 1] = nextNum;		// 다음 인덱스의 숫자를 빼서 갱신한 값으로 최신화
			}else {
				// 현재 인덱스의 수보다 다음 인덱스의 수가 작다면 패스
				continue;
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
