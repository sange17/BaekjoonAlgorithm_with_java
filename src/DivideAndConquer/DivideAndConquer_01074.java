package DivideAndConquer;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class DivideAndConquer_01074 {
	static int count = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int row = Integer.parseInt(st.nextToken());
		int column = Integer.parseInt(st.nextToken());
		int size = (int)Math.pow(2, N);
		
		recursive(size, row, column);
		System.out.println(count);
		br.close();
	}
	
	public static void recursive(int size, int row, int column) {
		if(size == 1) return;
		
		if(row < size/2 && column < size/2) {
			recursive(size/2, row, column);
		}
		else if(row < size/2 && column >= size/2) {
			count += size * size / 4;
			recursive(size/2, row, column - size / 2);
		}
		else if(row >= size / 2 && column < size / 2) {
			count += (size * size / 4) * 2;
			recursive(size/2, row - size / 2, column);
		}
		else {
			count += (size * size / 4) * 3;
			recursive(size/2, row - size / 2, column - size / 2);
		}
	}
}
