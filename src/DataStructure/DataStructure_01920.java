package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DataStructure_01920 {
	public static int nArray[];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		nArray = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) {
			nArray[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nArray);
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < m; i++) {
			if(binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
				sb.append(1).append("\n");
			}else {
				sb.append(0).append("\n");
			}
		}
		System.out.print(sb);
		br.close();
	}
	
	public static int binarySearch(int key) {
		int low = 0;
		int high = nArray.length - 1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			
			if(key < nArray[mid]) {
				high = mid - 1;
			}else if(key > nArray[mid]) {
				low = mid + 1;
			}else {
				return mid;
			}
		}
		
		return -1;
	}
}
