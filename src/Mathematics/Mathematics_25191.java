package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_25191 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int cola = Integer.parseInt(st.nextToken());
		int beer = Integer.parseInt(st.nextToken());
		int count = 0;
		
		count += (cola / 2 + beer);
		
		if(count > N) {
			System.out.println(N);
		}else {
			System.out.println(count);
		}
		
		br.close();
	}
}
