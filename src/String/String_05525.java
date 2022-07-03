package String;

import java.util.Scanner;

public class String_05525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();

        char[] arr = sc.next().toCharArray();		// 뮨자 배열 생성
        int[] dp = new int[M];
        int answer = 0;

        // 배열 탐색하며 "OI" 발견 시 "I"가 있는 인덱스 번호로 dp 배열에 +1하기
        for (int i = 1; i < M - 1; i++) {
            if (arr[i] == 'O' && arr[i + 1] == 'I') {
            	dp[i + 1] = dp[i - 1] + 1;

            	// N보다 크거나 같은 값이고 "i - 2 * N + 1"번째 인덱스
            	// 즉, Pn의 첫 I가 있을 경우 answer++
                if (dp[i + 1] >= N && arr[i - 2 * N + 1] == 'I')
                	answer++;
            }
        }

        System.out.println(answer);
	}
}
