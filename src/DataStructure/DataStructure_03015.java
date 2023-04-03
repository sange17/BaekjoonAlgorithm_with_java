package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class DataStructure_03015 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		long count = 1;
		
		for(int i = 0; i < N; i++) {
			
			array[i] = Integer.parseInt(br.readLine()); 
		}
		
		int sum = 0;
		int temp = 0;
		// 기준 인원: array[i], temp : 볼 수 있는 키를 가진 사람, 인원 배열 인덱스 값 : array[j]
		for(int i = 0; i < N - 2; i++) {
			
			temp = array[i + 1];
			for(int j = i + 2; j < N; j++) {
				
				if(array[i] >= temp && temp <= array[j]) {
					
					temp = array[j];
					
					count++;
				}
			}
						
			sum += count;
			count = 1;
		}
		
		// +1을 하는 이유는 마지막 쌍을 더해준 것임.
		System.out.println(sum + 1);
		br.close();
	}
}
