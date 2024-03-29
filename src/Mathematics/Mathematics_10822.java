package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Mathematics_10822 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ",");
		
		int sum = 0;
		while(st.hasMoreTokens()) {
			
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sum);
		br.close();
		
	}
}
