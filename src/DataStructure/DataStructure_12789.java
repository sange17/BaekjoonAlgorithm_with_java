package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class DataStructure_12789 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int num = 0;			// 맨 앞 순서 번호
		int checkNum = 1;		// 순서 체크 번호
		while(st.hasMoreTokens()) {
			num = Integer.parseInt(st.nextToken());
			stack.push(num);			// 어떤 순서든 먼저 스택에 삽입
			
			// 스택 사이즈가 0이 아닐 때 순서 체크 번호와 peek()의 값(1열 라인 맨 앞 번호)이 같다면
			while(stack.size() != 0) {
				if(checkNum == stack.peek()) {
					stack.pop();	// 1열 라인 맨 앞 번호(스택 top) 통과
					checkNum++;		// 순서 체크 번호 증가
				}else {
					break;			// 같지 않으면 다음 대기열 맨 앞 번호 반복
				}
			}
		
		}
		
		// 스택이 비어있다면 모두 통과 아니면 모두가 통과하지 못함
		if(stack.size() == 0) {
			System.out.println("Nice");
		}else {			
			System.out.println("Sad");
		}
	}
}
