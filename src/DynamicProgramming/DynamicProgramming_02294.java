package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class DynamicProgramming_02294 {
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
		
		// dpArray 배열에 100001 값들로 초기화, 0번째 인덱스는 0으로 초기화
		Arrays.fill(dpArray, 100001);
		dpArray[0] = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = array[i]; j <= k; j++) {
				dpArray[j] = Math.min(dpArray[j], dpArray[j - array[i]] + 1);
			}
		}
		
		System.out.println(dpArray[k] == 100001 ? -1 : dpArray[k]);
		br.close();
	}
}
