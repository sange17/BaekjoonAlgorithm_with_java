package DataStructure;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class DataStructure_10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int array[] = new int[n];
		int size = 0;
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			
			if(a != 0) {
				array[size] = a;
				size++;
			}else {
				size--;
				array[size] = 0;
			}
		}
		
		for(int j = 0; j < size; j++) {
			sum += array[j];
		}
		
		System.out.println(sum);
	}
}
