package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.io.IOException;

public class DataStructure_02002 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int[] array = new int[N];
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			map.put(br.readLine(), i);
		}
		
		for(int i = 0; i < N; i++) {
			array[i] = map.get(br.readLine());
		}
		
		
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				if(array[i] > array[j]) {
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
