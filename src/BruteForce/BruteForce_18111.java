package BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BruteForce_18111 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int row = Integer.parseInt(st.nextToken());
		int column = Integer.parseInt(st.nextToken());
		int height = 256;
		int in = 2;
		int out = 1;
		int inventory = Integer.parseInt(st.nextToken());
		int array[][] = new int[row][column];
		int min = 99999999;
		int max = 0;
		
		for(int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < column; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
				if(max < array[i][j]) {
					max = array[i][j];
				}
				if(min > array[i][j]) {
					min = array[i][j];
				}
			}
		}
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				array[i][j] = max - array[i][j];
				sb.append(array[i][j]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
