package Implementation;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Implementation_01205 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int newScore = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int score = 0;
		int rank = 0;
		
		if(N == 0) {
			
			System.out.println(1);
		}else {
			
			st = new StringTokenizer(br.readLine(), " ");
			rank = 1;
			
			stack.push(newScore);		// 새로운 기록을 다른 랭킹과 비교하기 위해 먼저 삽입
			
			for(int i = 1; i <= N; i++) {
				
				score = Integer.parseInt(st.nextToken());
				
				// 마지막 랭킹 기록이 새로운 기록보다 크거나 같다면 rank는 -1 
				if(i == P && score >= stack.peek()) {
					rank = -1;
					break;
				}
				
				// 같은 기록 등장 시 다음 반복으로
				if(score == newScore) {
					continue;
				}
				
				// 새로운 기록보다 랭킹 기록이 크면 rank는 +1
				if(stack.peek() < score) {
					rank++;
					continue;
				}
				
			}
			
			System.out.println(rank);
			br.close();
		}
	}
}
