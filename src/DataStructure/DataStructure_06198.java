package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

// 2493번 문제와 비슷하게 접근할 수 있는 문제
// 빌딩들이 모두 내림차수 일 경우 가능한 빌딩 수의  합이 (80000 * 80001) / 2가 32억 정도 이므로
// long형 자료형에 답을 넣어야 한다.
// 문제와는 다르게 오른쪽을 보고 비교하는 것이 아닌 왼쪽을 보고 비교하는 방식
public class DataStructure_06198 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long result = 0;
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < N; i++) {
			int height = Integer.parseInt(br.readLine());		// 현재 탑의 높이
			
			// 현재 탐의 높이보다 작거나 같다면 스택에서 제거
			while(!stack.isEmpty() && stack.peek() <= height) {
				stack.pop();
			}
			
			// 스택에 남은 수는 현재 탑보다 높은 탑들의 수 - 방금 넣은 탑의 개수(1)
			stack.push(height);
			result += stack.size() - 1;
		}
		
		System.out.println(result);
		br.close();
	}
}
