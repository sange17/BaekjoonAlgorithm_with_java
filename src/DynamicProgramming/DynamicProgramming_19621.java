package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

public class DynamicProgramming_19621 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		List<Room> roomList = new ArrayList<>();
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int hcount = Integer.parseInt(st.nextToken());
			
			roomList.add(new Room(start, end, hcount));
		}
		
		int rst = getMaxCount(N, roomList);
		System.out.println(rst);
		
		br.close();
	}
	
	
	
	private static int hcount;
	private static int getMaxCount(int n, List<Room> roomList) {
		hcount = 0;
		
		// n이 최대 25, dfs를 이용.
		dfs(0, roomList, 0, n);
		
		return hcount;
	}
	
	
	
	public static void dfs(int depth, List<Room> roomList, int cnt, int n) {
		// List의 Max 인덱스가 n-1까지이므로 이 이상이 되는 경우 모든 회의가 끝난다.
		if(depth > n - 1) {
			hcount = Math.max(hcount, cnt);
			return;
		}
		
		// 현재 회의 참여하는 경우 다음 회의 참여 못함
		dfs(depth + 2, roomList, cnt + roomList.get(depth).getHeadcount(), n);
		
		// 현재 회의 참여 안하는 경우 다음 회의 참여
		dfs(depth + 1, roomList, cnt, n);
	}
	
	static class Room{
		private int start;
		private int end;
		private int hcount;
		
		public Room(int start, int end, int hcount) {
			this.start = start;
			this.end = end;
			this.hcount = hcount;
		}
		
		public int getStart() {
			return start;
		}
		
		public int getend() {
			return end;
		}
		
		public int getHeadcount() {
			return hcount;
		}
	}
}

