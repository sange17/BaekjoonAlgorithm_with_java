package Mathematics;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Mathematics_10872 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int fac = 1;
		
		if(n >= 0 && n <= 12) {
			for(int i = n; i > 1; i--) {
				 fac *= i;
			}
			if(fac==0 || fac==1){
				System.out.println(1);				
			}else {
				System.out.println(fac);
			}
		}
	}
}
