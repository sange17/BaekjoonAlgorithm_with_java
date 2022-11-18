package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_13458 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
				
		int num = 0;
		long count = 0;
		for(int i = 0; i < N; i++) {
			
			num = array[i];
			
			if(num > B) {
				num -= B;
				count++;
								
				if(num % C != 0) {
					count += (num / C) + 1;
				}else {
					count += (num / C);
				}
				
			}else {
				count++;
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
