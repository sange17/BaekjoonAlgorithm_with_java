package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
	int to, weight;
	
	Node(int to, int weight){
		this.to = to;
		this.weight = weight;
	}
	
	// compareTo 주어진 객체의 순서를 비교한다.
	// 객체가 주어진 객체보다 작으면 음의 정수 같으면 0 크면 양의 정수를 반환한다.
	@Override
	public int compareTo(Node node) {
		// 자기 자신과 매개변수 객체를 비교
		return weight - node.weight;
	}
}

public class Graphs_01916 {
	
	static int cities, buses;
	static ArrayList<ArrayList<Node>> fromToWeightList;
	static int[] distance;
	static boolean[] visitCheck;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		cities = Integer.parseInt(br.readLine());
		buses = Integer.parseInt(br.readLine());
		
		// from일때 to로 향하는 가중치들을 담을 배열.
		fromToWeightList = new ArrayList<>();		
		distance = new int[cities + 1];				// 최소 비용 경로 담을 배열
		
		// O(N): for문과 비슷한 성능
		Arrays.fill(distance, Integer.MAX_VALUE);
		
		// O(N)
		// ArrayList안에 ArrayList담음
		for(int i = 0; i <= cities; i++) {
			fromToWeightList.add(new ArrayList<>());
		}
		
		// O(N)
		for(int i = 0; i < buses; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			
			// from에서 to로 가는 weight
			// fromToWeight[from[to, weight]]
			fromToWeightList.get(from).add(new Node(to, weight));
		}
		
		st = new StringTokenizer(br.readLine());
		int from = Integer.parseInt(st.nextToken());
		int to = Integer.parseInt(st.nextToken());
		
		// 
		System.out.println(dijkstra(from, to) + "\n");
		br.close();
	}

	// 다익스트라 알고리즘
	// 우선 순위 큐: O(log N) -> offer, poll
	public static int dijkstra(int start, int end) {
		PriorityQueue<Node> pq = new PriorityQueue<>();	
		visitCheck = new boolean[cities + 1];
		pq.offer(new Node(start, 0));
		distance[start] = 0;
		
		// O(log N)
		while(!pq.isEmpty()) {
			Node currentNode = pq.poll();
			int current = currentNode.to;
			
			// 방분하지 않은 곳이면
			if(!visitCheck[current]) {
				visitCheck[current] = true;		// 방문 체크, 방문한 곳은 다시 방문 못함
				
				// 한 정류장에서 여러 정류장으로 갈 수 있다. 
				// ex) (1 -> 2), (1 -> 3)...
				// 최소 비용 경로 최신화
				for(Node next : fromToWeightList.get(current)) {
					// 현재 경로에 가중치를 더한 것이 다음 경로보다 작다면 최신화
					if(distance[next.to] > distance[current] + next.weight) {
						distance[next.to] = distance[current] + next.weight;
						pq.add(new Node(next.to, distance[next.to]));
					}
				}
			}
		}

		return distance[end];
	}
}
