package Implementation;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

// 조건을 안보고 풀어서 첫 번째로 틀린 문제, 제발 조건을 잘 보고 풀자고 다시 생각하게 된 문제...
// int형은 10의 9승, long형은 10의 18승 정도의 표기가 가능하다.
// 형에 맞게 변환해 줄것... long형을 int로 반환해서 두 번째 틀림
// 첫 번재로 나오는 수가 클지 두 번째로 나오는 수가 클지 생각하지 못해서 3번째 틀림
public class Implementation_10093 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		long first = Long.parseLong(st.nextToken());
		long last = Long.parseLong(st.nextToken());
		
		long count = 0;
		
		// 두 수의 대소 비교해서 다르게 출력, 같은 경우는 두 수가 100000의 차이를 가지므로 없음 
		if(first < last) {
			for(long i = first + 1; i < last; i++) {
				count++;
				sb.append(i + " ");
			}
		}else {
			for(long i = last + 1; i < first; i++) {
				count++;
				sb.append(i + " ");
			}
		}
		
		System.out.println(count);
		System.out.println(sb);
		br.close();
	}
}
