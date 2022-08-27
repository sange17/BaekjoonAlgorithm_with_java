package Mathematics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mathematics_13136 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long R = Integer.parseInt(st.nextToken());
		long C = Integer.parseInt(st.nextToken());
		long N = Integer.parseInt(st.nextToken());
		long cctvR = R % N;
		long cctvC = C % N;
		
		if(cctvR == 0 && cctvC == 0) {
			cctvR = R / N;
			cctvC = C / N;
		}else if(cctvR != 0 && cctvC != 0) {
			cctvR = R / N + 1;
			cctvC = C / N + 1;
		}else if(cctvR == 0 && cctvC != 0) {
			cctvR = R / N;
			cctvC = C / N + 1;
		}else if(cctvR != 0 && cctvC == 0) {
			cctvR = R / N + 1;
			cctvC = C / N;
		}
		
		System.out.println(cctvR * cctvC);
		br.close();
	}
}
