package Mathematics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mathematics_10250 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int height = 0;
		int width = 0;
		int customer = 0;
		int floor = 0;
		int number = 0;
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			height = Integer.parseInt(st.nextToken());
			width = Integer.parseInt(st.nextToken());
			customer = Integer.parseInt(st.nextToken());
			
			floor = customer % height;
			if(floor == 0) {
				floor = height;
				number = customer / height;
				
				if(number < 10) {
					sb.append(floor).append(0).append(number).append("\n");
				}else {
					sb.append(floor).append(number).append("\n");
				}
			}else {
				floor = customer % height;
				number = customer / height + 1;
				
				if(number < 10) {
					sb.append(floor).append(0).append(number).append("\n");
				}else {
					sb.append(floor).append(number).append("\n");
				}
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
