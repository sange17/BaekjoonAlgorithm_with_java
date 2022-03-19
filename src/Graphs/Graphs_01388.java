package Graphs;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Graphs_01388 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int horizontalTileCount = 0;
		int verticalTileCount = 0;
		
		char array[][] = new char[N][M];
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < M; j++) {
				array[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(array[i][j] == '-') {
					horizontalTileCount++;
					
					while(j < M && array[i][j] == '-') {
						j++;
					}
				}
			}
		}
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(array[j][i] == '|') {
					verticalTileCount++;
					
					while(j < N && array[j][i] == '|') {
						j++;
					}
				}
			}
		}
		
		System.out.println(horizontalTileCount + verticalTileCount);
		br.close();
	}
}
