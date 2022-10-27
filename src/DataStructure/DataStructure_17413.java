package DataStructure;

import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;

// Deque를 활용하여 똑바로 출력과, 거꾸로 출력이 가능하도록 하였다.
public class DataStructure_17413 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		int strSize = str.length();
		boolean isCheck = false;
		
		Deque<Character> deque = new LinkedList<Character>();
		
		for(int i = 0; i < strSize; i++) {
			
			char character = str.charAt(i);
			
			// 마지막 문자일 때 처리
			if(i == strSize - 1 && isCheck == false) {
				
				deque.addLast(character);	// 마지막 문자 추가, 안하면 생략됨
				
				// 반대로 출력
				while(!deque.isEmpty()) {
					sb.append(deque.pollLast());
				}
			}
			
			// 괄호가 왔는지 판단
			if(character == '<') {
				isCheck = true;			// 괄호 출현 판단
				
				// 이전 내용 있다면 반대로 출력
				while(!deque.isEmpty()) {
					sb.append(deque.pollLast());
				}
				
				sb.append(character);
				
				continue;
				
			}else if(character == '>') {
				isCheck = false;		// 괄호 출현 판단
				
				// 이전 내용있다면 똑바로 출력
				while(!deque.isEmpty()) {
					sb.append(deque.pollFirst());
				}
				
				sb.append(character);
				continue;
			}
			
			// 괄호 밖에서의 처리과정
			if(isCheck == false) {
				// 괄호 밖에서 빈 칸이 올때 뒤에서부터 출력(반대로)
				if(character == ' ') {
					
					while(!deque.isEmpty()) {
						sb.append(deque.pollLast());
					}
					
					sb.append(' ');
					continue;
				}
				// 빈 칸이 아니면 삽입
				else{
					deque.addLast(character);	
				}
			}
			// 괄호 안에서의 처리과정
			else {
				
				deque.addLast(character);
			}
		}
				
		System.out.println(sb);
		br.close();
	}
}
