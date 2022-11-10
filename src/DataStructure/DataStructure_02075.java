package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// java15 환경에서 일차원 배열을 이용하고 정렬하여 풀어서 메모리 초과 오류가 생겼다.
// java11 환경에서 위의 과정대로 풀었더니 메모리 초과가 나지 않았다.
// 백준에서 특정 언어 버전에 대한 제한 조건을 걸어주어서 해당되는 언어를 사용하지 않을 경우 메모리 초과가 날 수 있다고 한다.
// java15로는 우선 순위 큐(힙 구조 이므로 정렬의 시간복잡도는 O(nlogn))를 활용하여 풀었다.
// java15는 위의 과정으로 풀어도 메모리 초과가 난다. java11은 위의 과정으로 하면 통과한다. 물론 실행 속도도 더 빠르다.
public class DataStructure_02075 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		
		// 먼저 첫째 줄을 우선 순위 큐에 넣고
		int num = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			num = Integer.parseInt(st.nextToken());
			
			pQueue.offer(num);
		}
		
		// 다음 라인 들의 수를 하나씩 비교해가며 현재 peek()값보다 크면 poll()로 가장 앞의 수를 삭제하고 현재 수를 offer()한다.
		for(int i = 1; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < N; j++) {
				num = Integer.parseInt(st.nextToken());
				
				if(pQueue.peek() < num) {
					pQueue.poll();
					pQueue.offer(num);	
				}
			}
		}
		
		System.out.println(pQueue.peek());
	}
}
