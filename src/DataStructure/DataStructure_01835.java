package DataStructure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DataStructure_01835 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Deque<Integer> deque = new ArrayDeque<>();
		
		deque.addFirst(N); 		// N카드 먼저 추가
		
		// 카드 마술 과정을 반대로 진행
		// deque를 활용하여 i를 deque 앞에 추가한 후 j번 반복하여 "마지막 요소를 처음에 추가"
		/*
		 * 실행 흐름 예
		 * 4(처음)			3 4(3 추가)
		 * 3 4				4 3(3번 바꿈)
		 * 4 3				2 4 3(2 추가)
		 * 2 4 3			4 3 2(2번 바꿈)
		 * 4 3 2			1 4 3 2(1 추가)
		 * 1 4 3 2			2 1 4 3(끝)
		 */
		for(int i = N - 1; i >= 1; i--) {
			
			deque.addFirst(i);
			
			for(int j = 0; j < i; j++) {
				
				int last = deque.removeLast();
				deque.addFirst(last);
			}
		}
		
		for(Integer i : deque) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}
}
