package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_01547 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int M = Integer.parseInt(br.readLine());
		boolean[] array = new boolean[4];
		
		array[1] = true;
		
		boolean temp;
		for(int i = 0; i < M; i++) {
			
			temp = false;
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			
			if(array[X] || array[Y]) {
				
				temp = array[Y];
				array[Y] = array[X];
				array[X] = temp;
			}
		}
		
		for(int i = 1; i <= 3; i++) {
			
			if(array[i]) {
				System.out.println(i);
				break;
			}
		}
		
		br.close();
	}
}
