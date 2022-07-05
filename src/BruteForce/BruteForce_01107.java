// 틀고 싶은 채널을 가기 위해 눌러야 하는 버튼의 최소 개수 구하기
// 이때 고장난 버튼은 누르지 못한다.

package BruteForce;

import java.util.Scanner;

public class BruteForce_01107 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();			// 틀고 싶은 채널
		int M = sc.nextInt();			// 고장난 버튼 개수
		
		boolean[] broken = new boolean[10];			// 고장난 버튼 담을 배열
		
		// 고장난 버튼 숫자 broken배열에 담기
		for(int i = 0; i < M; i++) {
			broken[sc.nextInt()] = true;
		}
		
		// 틀고싶은 채널에서 현재 채널(100)빼기, 절대값 반환
		// 숫자버튼 안 쓰고 이동할 경우의 값으로 초기화
		int result = Math.abs(N - 100);
		// 채널의 수는 무한이지만 이동하려고 하는 채널의 범위는 0부터 500000까지다.
		for(int i = 0; i < 1000000; i++) {
			String string = String.valueOf(i);
			int len = string.length();
			
			// 자릿수 숫자를 broken배열의 인덱스로 하여 고장난 버튼의 숫자인지 확인하고 
			// 고장난 버튼이 있다면 반복문 중지
			boolean isBreak = false;
			for(int j = 0; j < len; j++) {
				if(broken[string.charAt(j) - '0']) {
					isBreak = true;
					break;
				}
			}
			
			// 고장난 버튼은 !true, 고장나지 않은 버튼은 !false
			// 고장났다면 조건문 통과 안함, 고장나지 않았다면 통과
			// 통과하면 위아래 버튼 누른 횟수와, 길이를 더하고 최솟값을 result에 저장한다.
			if(!isBreak) {
				int min = Math.abs(N - i) + len;
				result = Math.min(min, result);
			}
		}
		
		System.out.println(result);
		sc.close();
	}
}
