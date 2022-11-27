package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DataStructure_13335 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());	// 다리를 건너는 트럭의 수
		int w = Integer.parseInt(st.nextToken());	// 다리의 길이
		int L = Integer.parseInt(st.nextToken());	// 다리의 최대하중
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		st = new StringTokenizer(br.readLine(), " ");
		int truckWeight = 0;
		int curWeight = 0;	// 다리 위 트럭의 무게
		int time = 0;	// 모든 트럭이 다리를 건너는 시간
		while(true) {
			
			truckWeight = Integer.parseInt(st.nextToken());
			curWeight += truckWeight;
			
			// 다리 위 트럭의 무게가 다리의 최대하중의 무게보다 큰 경우
			if(curWeight > L) {
				curWeight -= truckWeight;	// 다리 위 트럭 무게에 더했던 무게 빼기
				continue;
			}
			// 다리 위 트럭의 무게가 다리의 최대하중의 무게보다 작거나 같은 경우
			else {
				queue.add(truckWeight);
				time += (w - queue.size());
			}
		}
	}
}
