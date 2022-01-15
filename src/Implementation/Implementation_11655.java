package Implementation;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Implementation_11655 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char array[] = br.readLine().toCharArray();
		int n = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > 64 && array[i] < 91) {
				n = (array[i] + 13);
				if(n > 90) {
					n = n - 90 + 64;
					sb.append((char)n);
				}else {
					sb.append((char)n);
				}
			}else if(array[i] > 96 && array[i] < 123) {
				n = (array[i] + 13);
				if(n > 122) {
					n = n - 122 + 96;
					sb.append((char)n);
				}else {
					sb.append((char)n);
				}
			}else {
				sb.append(array[i]);
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
