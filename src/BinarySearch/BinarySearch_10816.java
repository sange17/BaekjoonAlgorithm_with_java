package BinarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class BinarySearch_10816 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int aArray[] = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) {
			aArray[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(aArray);
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < m; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			sb.append(upperBound(aArray, key) - lowerBound(aArray, key)).append(' ');
		}
		
		System.out.print(sb);
		br.close();
	}
	
	public static int lowerBound(int[] aArray, int key) {
		int low = 0;
		int high = aArray.length;
		
		while(low < high) {
			int mid = (low + high) / 2;
			
			if(key <= aArray[mid]) {
				high = mid;
			}else {
				low = mid + 1;
			}
		}
		
		return low;
	}
	
	public static int upperBound(int[] aArray, int key) {
		int low = 0;
		int high = aArray.length;
		
		while(low < high) {
			int mid = (low + high) / 2;
			
			if(key < aArray[mid]) {
				high = mid;
			}else {
				low = mid + 1;
			}
		}
		
		return low;
	}
}
