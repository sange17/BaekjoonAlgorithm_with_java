package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_24183 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int C4 = Integer.parseInt(st.nextToken());
		int A3 = Integer.parseInt(st.nextToken());
		int A4 = Integer.parseInt(st.nextToken());
		
		double G = (C4 * (0.229 * 0.324) * 2) + (A3 * (0.297 * 0.420) * 2) + (A4 * (0.210 * 0.297));
		
		System.out.printf("%.6f", G);
		br.close();
	}
}
