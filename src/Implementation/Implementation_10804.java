package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_10804 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int[] array = new int[21];
		
		for(int i = 1; i <= 20; i++) {
			array[i] = i;
		}
		
		int temp = 0;
		int a = 0;
		int b = 0;
		for(int i = 0; i < 10; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			for(int j = a; j < b; j++) {
				
				if(a > b) break;
				
				temp = array[b];
				array[b] = array[a];
				array[a] = temp;
				
				a++;
				b--;
			}
		}
		
		for(int i = 1; i <= 20; i++) {
			
			sb.append(array[i] + " ");
		}
		
		System.out.println(sb);
		br.close();
	}
}
