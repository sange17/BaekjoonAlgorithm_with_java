package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Sorting_05576 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arrayA = new int[10];
		int[] arrayB = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arrayA[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < 10; i++) {
			arrayB[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arrayA);
		Arrays.sort(arrayB);
		
		int sumA = arrayA[7] + arrayA[8] + arrayA[9];
		int sumB = arrayB[7] + arrayB[8] + arrayB[9];
		
		System.out.println(sumA + " " + sumB);
		br.close();
		
	}
}
