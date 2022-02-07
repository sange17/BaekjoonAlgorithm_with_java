package BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BruteForce_01018 {
	public static boolean[][] array;
	public static int min = 64;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		array = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			for(int j = 0; j < m; j++) {
				if(str.charAt(j) == 'W') {
					array[i][j] = true;
				}else {
					array[i][j] = false;
				}
			}
		}
		
		int row = n - 7;
		int column = m - 7;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				find(i, j);
			}
		}
		System.out.println(min);
		br.close();
	}
	
	public static void find(int x, int y) {
		
		int end_row = x + 8;
		int end_column = y + 8;
		int count = 0;
		
		boolean isCheck = array[x][y];
		
		for(int i = x; i < end_row; i++) {
			for(int j = y; j < end_column; j++) {
				if(array[i][j] != isCheck) {
					count++;
				}
				
				isCheck = !isCheck;
				
			}
			
			isCheck = !isCheck;
			
		}
		
		count = Math.min(count, 64 - count);
		
		min = Math.min(min, count);
	}
}
