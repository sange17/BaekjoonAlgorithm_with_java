package Implementation;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Arrays.sort는 DualPivotQuicksort 정렬방식을 사용하였고,
// 평균: O(nlogn), 최악: O(n^2)의 시간 복잡도를 가진다.
public class Implementation_10817 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int array[] = new int[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < 3; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		
		System.out.println(array[1]);
		br.close();
	}
}
