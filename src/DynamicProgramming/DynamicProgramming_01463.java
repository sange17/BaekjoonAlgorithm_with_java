package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DynamicProgramming_01463 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] dpArray = new int[n+1];
		
		dpArray[1] = 0;
		
		// 각 연산을 했을 때 가르키는 인덱스의 값은 가르켜진 값의 최소 연산의 수 이므로  +1을 하는 것은 n에 한번의 연산을 했다는 가정하에 하는 것이다.
		for(int i = 2; i <= n; i++) {
			dpArray[i] = dpArray[i-1] + 1;
			System.out.println(dpArray[i] + "   " + i);
			
			if(i % 2 == 0) {
				dpArray[i] = Math.min(dpArray[i], dpArray[i/2] + 1);
				System.out.println(dpArray[i] + " 2 " + i);
			}
			if(i % 3 == 0) {
				dpArray[i] = Math.min(dpArray[i], dpArray[i/3] + 1);
				System.out.println(dpArray[i] + " 3 " + i);
			}
		}
		
		System.out.println(dpArray[n]);
		br.close();
	}
}
