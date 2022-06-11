package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Graphs_16956 {
	static char[][] map;
	static int R,C;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine(), " ");
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		map = new char[R][C];
		
		for(int i = 0; i < R; i++) {
			String str = br.readLine();
			for(int j = 0; j < C; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		boolean flag = true;
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				// 해당 칸에 늑대가 있다면 상하좌우 탐색
				if(map[i][j] == 'W') {
					for(int k = 0; k < 4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						
						// 배열 범위를 벗어난 경우는 다음 반복을 실행한다.
						if(nx >= R || ny >= C || nx < 0 || ny < 0) continue;
						
						// 늑대 상하좌우 위치에 양이 있으면 늑대는 양이 있는 칸에 갈 수 있다.
						if(map[nx][ny] == 'S') flag = false;
						
						// 늑대 상하좌우 위치에 양이 없으면 
						// 늑대 상하좌우 위치에 울타리를 설치하여 양이 있는 칸에 갈 수 없도록 한다.
						if(map[nx][ny] == '.') map[nx][ny] = 'D';
					}
				}
			}
		}
		
		// 울타리를 어떻게 설치해도 늑대가 양이 있는 칸에 갈 수 있는 경우
		if(flag == false) 
			sb.append(0);
		else {		// 늑대가 양이 있는 칸에 갈 수 없는 경우 맵 출력
			sb.append(1).append("\n");
			for(int i = 0; i < R; i++) {
				for(int j = 0; j < C; j++) {
					sb.append(map[i][j]);
				}
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
