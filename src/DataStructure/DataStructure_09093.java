package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataStructure_09093 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String stack[] = new String[20];
		int top = 0;
		
		for(int i = 0; i < n; i++) {
			String array[] = br.readLine().split("");
			for(int j = 0; j < 0; j++) {
				if(array[j] == " ") {
					sb.append(array[top]);
				}else {
					
				}
			}
		}
	}
}
