package BinarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BinarySearch_01654 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int array[] = new int[k];
		long max = 0;
		
		for(int i = 0; i < k; i++) {
			array[i] = Integer.parseInt(br.readLine());
			if(max < array[i]) max = array[i];
		}
		
		max++;
		long min = 0;
		long mid = 0;
		while(min < max) {
			mid = (max + min) / 2;
			
			long count = 0;
			
			for(int i = 0; i < k; i++) {
				count += (array[i] / mid);
			}
			
			if(count < n) {
				max = mid;
			}else {
				min = mid + 1;
			}
		}
		System.out.print(min - 1);
		br.close();
	}
}
