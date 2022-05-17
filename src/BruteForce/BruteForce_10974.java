package BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BruteForce_10974 {
	static int N;
	static int array[];
	static boolean selected[];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		array = new int[N];
		selected = new boolean[N];
		
		permutation(0);
	}
	
	public static void permutation(int depth) {
		if(depth == N) {
			for(int i = 0; i < N; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(selected[i]) continue;
			array[depth] = i + 1;
			selected[i] = true;
			permutation(depth + 1);
			selected[i]  = false;
		}
	}
}
