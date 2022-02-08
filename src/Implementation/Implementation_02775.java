package Implementation;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Implementation_02775 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			int k = Integer.parseInt(br.readLine());
			int m = Integer.parseInt(br.readLine());
						
			int array[][] = new int[k+1][m+1];
			
			for(int j = 0; j < k + 1; j++) array[j][0] = 1;
			for(int j = 0; j < m + 1; j++) array[0][j] = j + 1;
			
			for(int row = 1; row < k + 1; row++) {
				for(int col = 1; col < m + 1; col++) {
					array[row][col] = array[row-1][col] + array[row][col-1];
				}
			}
			
			System.out.println(array[k][m-1]);
		}
		br.close();
	}
}
