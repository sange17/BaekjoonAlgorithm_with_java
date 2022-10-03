package Graphs;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

// 숨바꼭질 문제에서 순간이동 하는 시간만 1초에서 0으로 바뀌었고
// 조건문 실행 순서가 바뀌었다.
public class Graphs_13549 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		boolean[] visited = new boolean[100001];
		int[] cntArray = new int[100001];
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(N);			// 첫 시작점 좌표 저장
		visited[N] = true;		// 첫 시작점 방문 체크
		cntArray[N] = 0;		// 소요 시간 저장
		
		while(!queue.isEmpty()) {
			int now = queue.remove();		// 현제 좌표 큐에서 삭제후 그 값을 now에 저장
			
			// X * 2 이동 : 0초
			if(now * 2 < 100001) {
				if(visited[now * 2] == false) {
					queue.add(now * 2);
					visited[now * 2] = true;
					cntArray[now * 2] = cntArray[now];
				}
			}
			
			// X - 1 이동 : 1초
			if(now - 1 >= 0) {
				if(visited[now - 1] == false) {
					queue.add(now - 1);
					visited[now - 1] = true;
					cntArray[now - 1] = cntArray[now] + 1;
				}
			}
			
			// X + 1 이동 : 1초
			if(now + 1 < 100001) {
				if(visited[now + 1] == false) {
					queue.add(now + 1);
					visited[now + 1] = true;
					cntArray[now + 1] = cntArray[now] + 1;	
				}
			}
		}
		
		System.out.println(cntArray[K]);
		br.close();
	}
}
