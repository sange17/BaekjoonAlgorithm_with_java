package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_17874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		int LV = N - V;
		int LH = N - H;
		
		if(V >= LV) {
			LV = V;
		}
		
		if(H >= LH) {
			LH = H;
		}
		
		System.out.println(LV * LH * 4);
		br.close();
	}
}
