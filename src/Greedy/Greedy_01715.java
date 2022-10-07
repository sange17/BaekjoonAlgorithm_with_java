package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 우선 순위 큐 사용
// 힙으로 구성되어 이진트리 구조로 이루어짐, 시간복잡도 O(nlogn)
public class Greedy_01715 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		
		int num = 0;
		for(int i = 0; i < N; i++) {
			num = Integer.parseInt(br.readLine());
			
			pQueue.add(num);
		}
		
		int A = 0;
		int B = 0;
		int count = 0;
		while(pQueue.size() != 1) {
			A = pQueue.poll();		// O(logn)
			B = pQueue.poll();		// O(logn)
			
			count += A + B;		// 비교 횟수 누적
			
			// 비교 횟수 우선순위 큐에 저장, 자동 정렬되어 다음 연산에 쓰일지 말지 결정
			pQueue.add(A + B);
		}
		
		System.out.println(count);
		br.close();
	}
}
