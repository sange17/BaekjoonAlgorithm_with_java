package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

// 문자열 길이 최대 십만개, 명령어 개수 오십만개
// LinkedList는 삭제할 노드가 정해져 있다고 전제하에 O(1)이고, 그렇지 않다면 모두 탐색해야되는 O(n)을 갖는다.
public class DataStructure_01406 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		int M = Integer.parseInt(br.readLine());	// 명령어 개수
		
		// list.size -> O(1)..?
		LinkedList<Character> list = new LinkedList<Character>();
		
		for(int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}
		
		String command = "";
		char operator;
		char value;
		int cursor = list.size();
		int strSize = list.size();
		
		// 모두 탐색하는 대신 커서의 위치에서 양방향으로 움직이며 삽입/삭제를 할 수 있다.
		ListIterator<Character> iterator = list.listIterator();
		
		// 커서를 문자열 맨 뒤로 이동
		while(iterator.hasNext()) {
			iterator.next();
		}
		
		for(int i = 0; i < M; i++) {
			command = br.readLine();
			operator = command.charAt(0);
			
			// 왼쪽으로 커서 이동
			if(operator == 'L') {
				
				if(iterator.hasPrevious()) {
					iterator.previous();
				}
				continue;
			}
			
			// 오른쪽으로 커서 이동
			if(operator == 'D') {
								
				if(iterator.hasNext()) {
					iterator.next();
				}
				continue;
			}

			// 커서 왼쪽에 있는 값 삭제
			if(operator == 'B') {
				
				if(iterator.hasPrevious()) {
					iterator.previous();
					iterator.remove();
				}
				continue;
			}
			
			// 커서 위치에 값 추가
			if(operator == 'P') {
				value = command.charAt(2);		
				
				iterator.add(value);
				continue;
			}
		}
		
		for(char c : list) {
			sb.append(c);
		}
		
		// sb.toString은 문자열 길이에 비례하다.
		System.out.println(sb);
		br.close();
	}
}