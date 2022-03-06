package Graphs;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Graphs_02667 {
	static int[][] array;
	static boolean[][] visited;
	static int N;
	static int houseCount;
	
	static int[] directRow = {-1, 1, 0, 0};
	static int[] directColumn = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int count = 0;
		
		N = Integer.parseInt(br.readLine());
		
		array = new int[N][N];
		visited = new boolean[N][N];
		
		
		for(int i = 0; i < N; i++) {
			String[] str = br.readLine().split("");
			for(int j = 0; j < N; j++) {
				array[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(array[i][j] == 1 && !visited[i][j]) {
					dfs(i, j);
					sb.append(houseCount).append(" ");
					houseCount = 0;
					count++;
				}
			}
		}
		
		String str = sb.toString();
				
		StringTokenizer st = new StringTokenizer(str, " ");
		int[] houseCountArray = new int[st.countTokens()];
		for(int i = 0; i < houseCountArray.length; i++) {
			houseCountArray[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(houseCountArray);
		
		StringBuilder resultSb = new StringBuilder();
		for(int i = 0; i < houseCountArray.length; i++) {
			resultSb.append("\n").append(houseCountArray[i]);
		}
		
		resultSb.insert(0, count);
		System.out.println(resultSb);
		br.close();
	}
	
	public static void dfs(int row, int column) {
		visited[row][column] = true;
		
		houseCount++;
		
		for(int i = 0; i < 4; i++) {
			int searchRow = row + directRow[i];
			int searchColumn = column + directColumn[i];
			
			if((searchRow >= 0 && searchColumn >= 0) && (searchRow < N && searchColumn < N)) {
				if(array[searchRow][searchColumn] == 1 && !visited[searchRow][searchColumn]) {
					dfs(searchRow, searchColumn);
				}
			}
		}
	}
}
