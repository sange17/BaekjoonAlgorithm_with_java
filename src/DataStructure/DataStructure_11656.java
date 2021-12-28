package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DataStructure_11656 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String array[] = br.readLine().split("");
		String result[] = new String[array.length];
		String str = "";
		
		for(int i = array.length - 1; i >= 0; i--) {
			str = array[i] + str;
			result[i] = str;
		}
		
		Arrays.sort(result);
		
		for(int j = 0; j < array.length; j++) {
			System.out.println(result[j]);
		}
	}
}
