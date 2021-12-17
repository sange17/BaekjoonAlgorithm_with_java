// น้มุ 04375น๘ <1>

package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mathematics_04375 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, len, cnt, tmp;
		String str;
		
		while((str = br.readLine()) != null) {
			tmp = 1;
			len = 1;
			cnt = 1;
			n = Integer.parseInt(str);
			
			while(true) {
				if(tmp % n == 0) break;
				
				cnt++;
				tmp = (tmp * 10 + 1) % n;
			}
			System.out.println(cnt);
		}
	}
}
