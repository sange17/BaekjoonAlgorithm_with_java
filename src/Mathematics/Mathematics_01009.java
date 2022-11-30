package Mathematics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

// 평소대로 Math.pow 메소드나 반복문을 이용한 제곱 계산을 하면 틀린다.
// 숫자를 제곱할 떄 규칙을 찾고 일의 자리 숫자만 계속 계산하며 풀 수 있다.
// 분할 정복 알고리즘으로도 풀어볼 것 시간이 훨씬 빨라진다.
// 분할 정복 알고리즘 대신 수학식으로 빠르게 나온 경우 있음(아래 코드 참조).
public class Mathematics_01009 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;
//		StringBuilder sb = new StringBuilder();
//		
//		int T = Integer.parseInt(br.readLine());
//		int data = 1;
//		for(int i = 0; i < T; i++) {
//			
//			st = new StringTokenizer(br.readLine(), " ");
//			
//			int a = Integer.parseInt(st.nextToken());
//			int b = Integer.parseInt(st.nextToken());
//			
//			if(a % 10 == 0) {
//				data = 10;
//			}else {
//				for(int j = 0; j < b; j++) {
//					
//					data *= a;
//					data %= 10;
//				}
//			}
//			
//			sb.append(data + "\n");
//			
//			data = 1;
//		}
//		
//		System.out.println(sb);
//		br.close();
//	}
	
	// 수식을 사용해 시간을 많이 줄인 문제 분할 정복 알고리즘 안씀
//	public static void main(String[] args) throws IOException
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int cnt = Integer.parseInt(br.readLine());
//		for(int i=0; i<cnt; i++)
//		{
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int a = Integer.parseInt(st.nextToken());
//			int b = Integer.parseInt(st.nextToken());
//			int square = b % 4 == 0? 4 : b % 4;
//			if(Math.pow(a, square) % 10 == 0) System.out.println("10");
//			else System.out.println(Math.round(Math.pow(a, square) % 10));
//		}
//	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCount = Integer.parseInt(br.readLine());
		
		for ( int i = 0 ; i < testCount ; i ++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());			
			
			int answer = divideAndConquer(a, b);
			if ( i != 0 ) {
				bw.newLine();
			}
            if ( answer == 0 ) answer = 10;
			bw.write(String.valueOf(answer));
		}
		br.close();
		bw.flush();
		bw.close();
		
	}
	
	private static int divideAndConquer(int a, int b) {
		if ( b == 1 ) {
			int result = a % 10;
//			System.out.println(a + " ^ "+b + "%10 = "+result);
			return result;
		}else {
					
			int temp = divideAndConquer(a, b / 2) % 10;
			
			int result = (temp * temp) % 10;
			
			// b가 1이 아닌 홀수인 경우에 처리되는 문장.
			// 1의 자리수를 한번더 곱하고 다시 1의 자릿수를 구하기 위함.
			if (b % 2 != 0) {
				result = (a % 10 * result) % 10;
				System.out.println(a + " " + b + " " + result);
			}
			
//			System.out.println(a + "^" + b + " % 10 = " + result);
			return result;
		}
	}
}
