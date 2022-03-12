package DynamicProgramming;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicProgramming_02670 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		double[] array = new double[10001];
		
		for(int i = 0; i < n; i++) {
			array[i] = Double.parseDouble(br.readLine());
		}
		
		double max = array[0];
		for(int i = 1; i < n; i++) {
			array[i] = Math.max(array[i], array[i] * array[i-1]);
			max = Math.max(max, array[i]);
		}
		
		System.out.printf("%.3f", max);
		br.close();
	}
}
