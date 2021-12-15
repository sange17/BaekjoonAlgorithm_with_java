package Sorting;

import java.util.Scanner;

public class Sorting_02750 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;
		int inputArray [];
		int temp = 0;
		
		System.out.print("");
		n = scanner.nextInt();
		inputArray = new int [n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("");
			inputArray[i]=scanner.nextInt();
		}
		
		for(int i = 0; i < n-1; i++) {
			for(int j = 1; j < n-i; j++) {
				if(inputArray[j-1] > inputArray[j]) {
					temp = inputArray[j];
					inputArray[j] = inputArray[j-1];
					inputArray[j-1] = temp;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(inputArray[i]);
		}
	}
}