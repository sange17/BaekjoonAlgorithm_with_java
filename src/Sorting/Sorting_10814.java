package Sorting;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sorting_10814 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int numArray[] = new int[n];
		String strArray[] = new String[n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			numArray[i] = Integer.parseInt(st.nextToken());
			strArray[i] = st.nextToken();
		}
		
		int numTemp = 0;
		String strTemp = "";
		for(int i = 0; i < n; i++) {
			for(int j = n - 1; j > i; j--) {
				if(numArray[j] < numArray[j - 1]) {
					numTemp = numArray[j-1];
					numArray[j-1] = numArray[j];
					numArray[j] = numTemp;
					
					strTemp = strArray[j-1];
					strArray[j-1] = strArray[j];
					strArray[j] = strTemp;
				}				
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(numArray[i] + " " + strArray[i]);
		}
	}
}
