package Mathematics;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Mathematics_11050 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String array[] = br.readLine().split(" ");
		int n = Integer.parseInt(array[0]);
		int k = Integer.parseInt(array[1]);
		int n_fac = 1;
		int k_fac = 1;
		int nk_fac = 1;
		int result = 0;
		
		for(int i = n; i > 1; i--) {
			 n_fac *= i;
		}
		for(int i = k; i > 1; i--) {
			 k_fac *= i;
		}
		for(int i = n-k; i > 1; i--) {
			 nk_fac *= i;
		}
		
		result = n_fac/(k_fac*nk_fac);
		if(result==0 || result==1){
			System.out.println(1);				
		}else {
			System.out.println(result);
		}
	}
}
