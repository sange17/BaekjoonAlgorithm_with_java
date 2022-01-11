package Mathematics;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Mathematics_10039 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		
		int i = 5;
		while(i > 0) {
			int n = Integer.parseInt(br.readLine());
			
			if(n < 40) {
				n = 40;
				sum += n;
			}
			else {
				sum += n;
			}
			i--;
		}
		
		System.out.println(sum/5);
		br.close();
	}
}
