package DynamicProgramming;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicProgramming_02156 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		int[] dpArray = new int[N];
		
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		dpArray[0] = array[0];
		
		for(int i = 1; i < N; i++) {
			if(i == 1) {
				dpArray[1] = array[0] + array[1];
				continue;
			}
			
			if(i == 2) {
				dpArray[2] = Math.max(dpArray[1], Math.max(dpArray[0] + array[2], array[1] + array[2]));
				continue;
			}
			
			dpArray[i] = 
					Math.max(dpArray[i - 1], 
					Math.max(dpArray[i - 2] + array[i], dpArray[i - 3] + array[i - 1] + array[i]));
		}
		System.out.println(dpArray[N - 1]);
	}
}
