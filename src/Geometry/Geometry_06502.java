package Geometry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Geometry_06502 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int i = 0;
		while(true) {
			String str = br.readLine();
			
			if(str.equals("0")) break;
			
			st = new StringTokenizer(str, " ");
			
			int r = Integer.parseInt(st.nextToken());
			double w = Double.parseDouble(st.nextToken());
			double l = Double.parseDouble(st.nextToken());
			
			i++;
			if(r * 2 >= Math.sqrt(w * w + l * l)) {
				sb.append("Pizza " + i + " fits on the table.\n");
			}else {
				sb.append("Pizza " + i + " does not fit on the table.\n");
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
