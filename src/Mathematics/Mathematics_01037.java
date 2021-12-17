// 백준 01037번 <약수>

package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Mathematics_01037 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String array[] = new String [n];
		int min = 10000001;
		int max = 1;
		
		array = br.readLine().split(" ");
		
		for(int i = 0; i < n; i++) {
			if(Integer.parseInt(array[i]) > max) {
				max = Integer.parseInt(array[i]);
			}
			
			if(Integer.parseInt(array[i]) < min) {
				min = Integer.parseInt(array[i]);
			}
		}
		System.out.println(max*min);
	}
}
