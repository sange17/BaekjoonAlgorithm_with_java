package Greedy;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Grade implements Comparable<Grade> {
	int a;
	int b;
	
	Grade(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int compareTo(Grade o) {
		if(this.a > o.a) {
			return 1;
		}else {
			return -1;
		}
	}
}

public class Greedy_01946 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			ArrayList<Grade> list = new ArrayList<>();
			
			for(int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
								
				list.add(new Grade(a, b));
			}
			
			Collections.sort(list);		// 서류 점수 기준 오름차순 정렬
			
			int answer = 1;	// 서류 점수 1등은 무조건 통과라서 인원 수에 미리 +1
			int min = list.get(0).b; 	// 면접 점수 최소값
			// 서류 점수 2등부터 비교 시작
			for(int j = 1; j < N; j++) {
				if(list.get(j).b < min) {		// 이전의 최소 면접 점수보다 낮으면
					answer++;
					min = list.get(j).b;		// 최소 면접 점수 최신화
				}
			}
			System.out.println(answer);
		}
		
		br.close();
	}
}
