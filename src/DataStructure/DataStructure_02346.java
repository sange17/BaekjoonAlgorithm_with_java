package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


//Deque를 사용한 풍선 터뜨리기 문제
/*
*원형 큐로 풀어도 되지만 deque로 푼다는 점이 새로웠다.
*value 값이 0보다 작을 때는 deque끝에 있는 값을 앞으로 옮기는 걸 반복하고
*0보다 클 때는 deque 앞에 있는 값을 뒤로 옮기는 걸 반복하는데
*이때는 value--를 해주어 엉뚱한 위치가 출력되지 않게 해야한다.
*/
public class DataStructure_02346 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Point> deque = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			deque.add(new Point(i, num));
		}
		
		while(!deque.isEmpty()) {
			sb.append(deque.getFirst().position + " ");//	먼저 위치 꺼낸다.
			int value = deque.poll().value;		// 꺼낸 위치의  값은 이동 횟수에 사용. 한번 꺼냈으니 deque의 크기가 작아진다.
			if(deque.isEmpty()) break;
			
			if(value > 0) {
				value--;
				for(int i = 0; i < value; i++) {
					deque.addLast(deque.pollFirst());
				}
			}else {
				for(int i = 0; i < Math.abs(value); i++) {
					deque.addFirst(deque.pollLast());
				}
			}
		}
		System.out.println(sb.toString());
		
		br.close();
	}
	
	static class Point{
		int position;
		int value;
		public Point(int position, int value) {
			super();
			this.position = position;
			this.value = value;
		}
	}
}
