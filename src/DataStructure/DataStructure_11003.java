package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 우선 순위 큐를 사용하여 풀면 우선 순위 큐의 정렬하는 특징 때문에 시간 초과가 난다.
public class DataStructure_11003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int num = 0;
		
		Deque<int[]> deque = new LinkedList<int[]>();
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			num = Integer.parseInt(st.nextToken());
			
			// num보다 큰 수가 있다면 덱에서 다 삭제한다.
			while(!deque.isEmpty() && deque.peekLast()[0] > num) deque.pollLast();
			
			// 덱에 맨 오른쪽에 num과 인덱스 번호를 삽입한다.
			deque.offer(new int[] {num, i});
			
			// 큰 수들을 삭제한 후 범위를 한 칸 움직인다.
			if(deque.peek()[1] < i - ( L - 1)) deque.poll();
			
			sb.append(deque.peek()[0]+ " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
