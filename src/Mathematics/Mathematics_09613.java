package Mathematics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mathematics_09613 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st.nextToken());
			int array[] = new int[n];
			long sum = 0;
			
			for(int j = 0; j < n; j++) {
				array[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j = 0; j < n - 1; j++) {
				for(int k = j + 1; k < n; k++) {
					int large = 0;
					int small = 0;
					int remain = 0;
					
					if(array[j] > array[k]) {
						large = array[j];
						small = array[k];
					}else {
						large = array[k];
						small = array[j];
					}
					
					while(true) {
						remain = large % small;
						
						if(remain == 0) {
							sum += small;
							break;
						}
						large = small;
						small = remain;
					}
				}
			}
			System.out.println(sum);
		}
		br.close();
	}
}
