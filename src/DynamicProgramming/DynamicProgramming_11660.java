package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DynamicProgramming_11660 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 입력된 수들을 담을 map 이차원 배열과, map을 사용해서 계산된 누적합을 담을 dp 이차원 배열 생성
		int[][] map = new int[N + 1][N + 1];
		int[][] dp = new int[N + 1][N + 1];
		
		// map에 입력된 수들 담기
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 1; j <= N; j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}
		
		// map을 사용하여 입력된 수들로 계산된 영역의 누적합 담기
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + map[i][j];
			}
		}
		
		// (x1, y1) 왼쪽 위 좌표, (x2, y2) 오른쪽 아래 좌표 사이의 영역
		int x1, y1, x2, y2;
		
		// M개의 영역 좌표 활용
		for(int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			
			// 큰 영역에서 작은 영역들을 빼고 빼는 과정 중에 겹쳐져서 빼진 영역을 더한 과정
			sb.append((dp[x2][y2] - dp[x2][y1-1] - dp[x1-1][y2] + dp[x1-1][y1-1]) + "\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
