package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class DynamicProgramming_02293 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] array = new int[n];
		int[] dpArray = new int[k+1];
				
		for(int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		dpArray[0] = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= k; j++) {
				if(j >= array[i]) {
					dpArray[j] += dpArray[j - array[i]];
				}
			}
		}
		System.out.println(dpArray[k]);
	}
}
