package Greedy;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class Greedy_11399 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String array[] = br.readLine().split(" ");
		int sortArray[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			sortArray[i] = Integer.parseInt(array[i]);
		}
		
		Arrays.sort(sortArray);
		
		int sum = 0;
		int result = 0;
		for(int i = 0; i < n; i++) {
			sum += sortArray[i];
			result += sum;
		}
		
		System.out.print(result);
		br.close();
	}
}
