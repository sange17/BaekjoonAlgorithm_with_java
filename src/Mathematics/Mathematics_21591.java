package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_21591 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String str = br.readLine();
		
		st = new StringTokenizer(str, " ");
		int width1 = Integer.parseInt(st.nextToken());
		int height1 = Integer.parseInt(st.nextToken());
		int width2 = Integer.parseInt(st.nextToken());
		int height2 = Integer.parseInt(st.nextToken());
		
		if((width1 > width2) 
				&& (height1 > height2)
				&& Math.abs(width1 - width2) >= 2
				&& (Math.abs(height1 - height2) >= 2)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		br.close();
	}
}
