// <착각한 점>
// row열 마다 최댓값을 왼쪽으로 몰고
// col열 마다 최대값을 아래쪽으로 몰아서
// 왼쪽, 오른쪽 또는 앞쪽, 뒤쪽에서 도형을 바라봤을 때
// 가장 높은 면들을 더해서 한 쪽에서 봤을 때 가장 넓은 겉넓이를 구했고 
// 양쪽이기에 곱하기 2를 해주었다.
// 여기에 위와 아래에서 봤을 때 보이는 겉넓이 N * M * 2를 더해서 
// 도형의 위 아래 겉넓이를 구했다.
// 하지만 row나 col이 4 3 4 이런 식으로 큰 값 사이의 겉넓이는 구할 수 없다는 것을 알게되었다.
// 그래서 사방 탐색을 이용하여 현재 위치한 종이의 칸과 다음 칸을 비교하여 작은 값이 위치하면
// 현재 위치한 값과 더 작은 값을 빼주어 큰 값 사이의 값도 겉넓이로 더해주었다.

package Geometry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Geometry_16931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] xyArray = new int[N][M];
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		int result = 0;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < M; j++) {
				xyArray[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		result += 2 * N * M;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				for(int k = 0; k < 4; k++) {
					int nowX = i + dx[k];
					int nowY = j + dy[k];
					if(nowX < 0 || nowY < 0 || nowX > N - 1 || nowY > M - 1) {
						result += xyArray[i][j];
						continue;
					}
					if(xyArray[nowX][nowY] < xyArray[i][j]) {
						result += xyArray[i][j] - xyArray[nowX][nowY];
					}
				}
			}
		}
		
		System.out.println(result);
	}
}
