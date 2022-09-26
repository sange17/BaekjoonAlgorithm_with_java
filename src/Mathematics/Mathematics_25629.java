package Mathematics;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_25629 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int pairCount = 0;
		int oddCount = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			
			int num = Integer.parseInt(st.nextToken());
			
			if(num % 2 ==0) {
				pairCount++;
			}else {
				oddCount++;
			}
		}
		
		if(oddCount == pairCount || oddCount - 1 == pairCount) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		br.close();
	}
}
