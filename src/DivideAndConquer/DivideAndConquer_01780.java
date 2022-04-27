package DivideAndConquer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DivideAndConquer_01780 {
	static int[][] paper;
	static int RED = 0;
	static int GREEN = 0;
	static int BLUE = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		paper = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		partition(0, 0, N);
		
		System.out.println(RED);
		System.out.println(GREEN);
		System.out.println(BLUE);
		
		br.close();
	}
	
	public static void partition(int row, int column, int size) {
		if(check(row, column, size)) {
			if(paper[row][column] == -1) {
				RED++;
			}else if(paper[row][column] == 0) {
				GREEN++;
			}else if(paper[row][column] == 1) {
				BLUE++;
			}
			return;
		}
				
		int newSize = size / 3;
		
		partition(row, column, newSize);
		partition(row, column + newSize, newSize);
		partition(row, column + 2 * newSize, newSize);
		
		partition(row + newSize, column, newSize);
		partition(row + newSize, column + newSize, newSize);
		partition(row + newSize, column + 2 * newSize, newSize);
		
		partition(row + 2 * newSize, column, newSize);
		partition(row + 2 * newSize, column + newSize, newSize);
		partition(row + 2 * newSize, column + 2 * newSize, newSize);
	}
	
	public static boolean check(int row, int column, int size) {
		int color = paper[row][column];
		
		for(int i = row; i < row + size; i++) {
			for(int j = column; j < column + size; j++) {
				if(color != paper[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
