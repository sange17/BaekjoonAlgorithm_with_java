package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_19698 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int cowCount = (W / L) * (H / L); 
				
		if(cowCount >= N) {
			System.out.println(N);
		}else {
			System.out.println(cowCount);
		}
	}
}
