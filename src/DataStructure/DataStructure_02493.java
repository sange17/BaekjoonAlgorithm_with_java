package DataStructure;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class DataStructure_02493 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		Stack<int[]> stack = new Stack<int[]>();
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i <= N; i++) {
			int currentTop = Integer.parseInt(st.nextToken());
			
			// 먼저 현재 탑의 높이와 이전에 스택에 들어가 있던 탑의 높이를 비교하고 후에 스택에 삽입한다.
			while(!stack.isEmpty()) {
				
				// 이전에 스택에 삽입한 배열 객체의 높이보다 스택에 있던 top의 높이가 높으면
				if(stack.peek()[1] > currentTop) {
					sb.append(stack.peek()[0] + " ");	// 이전에 삽입한 인덱스 번호 추가
					break;
				}
				// 이전에 스택에 삽입한 배열 객체의 높이보다 스택에 있던 top의 높이가 낮으면
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				sb.append(0 + " ");
			}
			
			// 위의 과정을 마치고 스택에 인덱스와, 현재 타워의 높이를 배열 객체로 push한다.
			stack.push(new int[] {i, currentTop});
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
