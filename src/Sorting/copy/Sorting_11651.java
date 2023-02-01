package Sorting.copy;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sorting_11651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int array[][] = new int[n][2];
		
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array, new Comparator<int[]>() {
			public int compare(int[] arr1, int[] arr2){
				if(arr1[1] == arr2[1]) {
					return arr1[0] - arr2[0];
				}else {
					return arr1[1] - arr2[1];
				}
			}
		});
		
		for(int i = 0; i < n; i++) {
			sb.append(array[i][0] + " " + array[i][1] + "\n");
		}
		System.out.println(sb);
		br.close();
	}
}
