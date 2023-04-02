package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_08949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int[] array = new int[14];
		int idx = 0;
		while(true) {
			
			if(A == 0 && B ==0) break;
			
			array[idx] = (A % 10) + (B % 10);
						
			A /= 10;
			B /= 10;
			
			idx++;
		}
		
		boolean flag = false;
		for(int i = 13; i >= 0; i--) {
			
			if(array[i] == 0 && flag == false) {
				continue;
			}else {
				System.out.print(array[i]);
				flag = true;
			}
		}
		
		br.close();
		
	}
}
