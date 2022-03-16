package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Mathematics_15727 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		while(n != 0) {
			if(n - 5 >= 0) {
				n -= 5;
				count++;
				continue;
			}else if(n - 4 >= 0) {
				n -= 4;
				count++;
				continue;
			}else if(n - 3 >= 0) {
				n -= 3;
				count++;
				continue;
			}else if(n - 2 >= 0) {
				n -= 2;
				count++;
				continue;
			}else if(n - 1 >= 0) {
				n -= 1;
				count++;
				continue;
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
