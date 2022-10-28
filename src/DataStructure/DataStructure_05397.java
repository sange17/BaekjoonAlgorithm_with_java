package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

// 에디터 문제와 비슷한 문제
public class DataStructure_05397 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		String str = "";
		int strLength;
		char value;
		
		LinkedList<Character> list;
		// 모두 탐색하는 대신 커서의 위치에서 양방향으로 움직이며 삽입/삭제를 할 수 있다. 커서 역할.
		ListIterator<Character> iterator;
		
		for(int t = 0; t < T; t++) {
			
			str = br.readLine();
			strLength = str.length();
			
			list = new LinkedList<Character>();
			iterator = list.listIterator();
			
			for(int i = 0; i < strLength; i++) {
				
				value = str.charAt(i);
				
				// 왼쪽으로 커서 이동
				if(value == '<') {
					
					if(iterator.hasPrevious()) {
						iterator.previous();
					}
				}
				
				// 오른쪽으로 커서 이동
				else if(value == '>') {
							
					if(iterator.hasNext()) {
						iterator.next();
					}
				}
				
				// 커서 왼쪽 값 삭제
				else if(value == '-') {
					if(iterator.hasPrevious()) {
						iterator.previous();
						iterator.remove();
					}
				}
				
				// 커서 위치에 값 추가
				else {
					iterator.add(value);
				}
			}
			
			for(char c : list) {
				sb.append(c);
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}