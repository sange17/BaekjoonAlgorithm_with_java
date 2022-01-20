package BinarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinarySearch_02805 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		int[] array = new int[n];
		
		int treeMin = 0;
		int treeMax = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			
			if(treeMax < array[i]) {
				treeMax = array[i];
			}
		}
		
		while(treeMin < treeMax) {
			int mid = (treeMin + treeMax) >>> 1;
			long sum = 0;
			
			for(int i = 0; i < n; i++) {
				if(array[i] - mid > 0) {
					sum += array[i] - mid;
				}
			}
			
			if(sum < l) {
				treeMax = mid;
			}else {
				treeMin = mid + 1;
			}
		}
		
		System.out.print(treeMin - 1);
		br.close();
	}
}
