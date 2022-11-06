package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Math.pow 연산은 일반적으로 O(logn)의 시간 복잡도를 갖는다.
// 반복문 안에서 위의 연산을 사용시 호출을 여러번 해야되므로 실행 시간이 오래 걸릴 수 있다.
// 그래서 제곱 연산은 일반적인 곱셈 연산으로 작성하는 것이 좋다.
public class Mathematics_23037 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int sum = 0;
		int position = 10000;
		int current = 0;
		
		for(int i = 0; i < 4; i++) {
			current = num / position;
			
			sum += (current * current * current * current * current);
			
			num %= position;
			position /= 10;
		}
		
		sum += Math.pow(num, 5);
		
		System.out.println(sum);
		br.close();
	}
}
