package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class DataStructure_01406 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		int N = Integer.parseInt(br.readLine());
		LinkedList<Character> list = new LinkedList<Character>();
		
		for(int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}
		
		String command = "";
		char operator;
		char value;
		int cursor = list.size();
		for(int i = 0; i < N; i++) {
			command = br.readLine();
			operator = command.charAt(0);
			
			// 왼쪽으로 커서 이동
			if(operator == 'L') {
				cursor--;
				
				// 커서가 맨 왼쪽에 있을 때
				if(cursor <= -1) {
					cursor = -1;
				}
			}
			
			// 오른쪽으로 커서 이동
			if(operator == 'D') {
				cursor++;
				
				if(cursor == list.size()) {
					cursor = list.size();
				}
			}

			// 커서 왼쪽에 있는 값 삭제
			if(operator == 'B') {
				
				// 커서가 중간에 있을 때
				if(cursor < list.size() && cursor > -1) {
					cursor--;
					
					// 커서가 중간에 있다가 맨 왼쪽으로 가게 되었을 때
					if(cursor == -1) {
						cursor = -1;
					}else {
						list.remove(cursor);
					}
				}
				
				// 커서가 맨 오른쪽에 있을 때
				if(cursor == list.size()) {
					cursor--;
					list.remove(cursor);
				}
				
				// 커서가 맨 왼쪽에 있을 때
				if(cursor == -1) {
					cursor = -1;
				}
			}
			
			// 커서 위치에 값 추가
			if(operator == 'P') {
				value = command.charAt(2);
				
				// 커서가 중간에 있을 때
				if(cursor != list.size() && cursor != -1) {
					list.add(cursor, value);
					cursor++;					
				}
				
				// 커서가 맨 오른쪽에 있을 때
				if(cursor == list.size()) {
					list.add(cursor, value);
					cursor++;
				}
				
				// 커서가 맨 왼쪽에 있을 때
				if(cursor == -1) {
					cursor++;
					list.add(cursor, value);
				}
			}
			
			System.out.println();
			System.out.println("커서: " + cursor);
			System.out.println("반복 횟수: " + (i + 1) + "	" + list);
			System.out.println("-------------------------------");
		}
		
		for(char c : list) {
			sb.append(c);
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
