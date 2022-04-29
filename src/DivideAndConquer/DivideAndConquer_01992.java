package DivideAndConquer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DivideAndConquer_01992 {
	static int[][] map;
	static int BLACK = 0;
	static int WHITE = 0;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j) - 48;
			}
		}
		
		QuadTree(0, 0, N);
		System.out.println(sb);
		br.close();
	}
	
	public static void QuadTree(int x, int y, int size) {
		if(check(x, y, size)) {
			sb.append(map[x][y]);
			return;
		}
		
		int newSize = size / 2;
		
		sb.append('(');
		
		QuadTree(x, y, newSize);
		QuadTree(x, y + newSize, newSize);
		QuadTree(x + newSize, y, newSize);
		QuadTree(x + newSize, y + newSize, newSize);
		
		sb.append(')');
	}
	
	public static boolean check(int x, int y, int size) {
		int value = map[x][y];
		
		for(int i = x; i < x + size; i++) {
			for(int j = y; j < y + size; j++) {
				if(value != map[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
