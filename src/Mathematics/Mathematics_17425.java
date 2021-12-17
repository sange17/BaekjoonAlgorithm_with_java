package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mathematics_17425 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int num, sum;

		for(int i = 0; i < n; i++) {
			sum = 0;
			num = Integer.parseInt(br.readLine());
			
			if(num == 1) {
				System.out.println(sum + 1);
				continue;
			}
			
			// 1부터 n까지 각각의 수의 약수의 합을 모두 합한 값을 출력하는 것
			// 1부터 n까지 각각의 수의 약수의 개수
			for(int j = 1; j <= num; j++) {
				if(num % j == 0) {
					sum++;
				}
			}
			
			// switch문 사용해서 약수 개수별로 계산 후 모두 합한 것을 출력하기
			System.out.println(sum);
		}		
	}
}
