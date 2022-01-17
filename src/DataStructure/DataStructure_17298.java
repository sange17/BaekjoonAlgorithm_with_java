package DataStructure;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DataStructure_17298 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String array[] = br.readLine().split(" ");
		boolean isCheck = false;
		
		for(int i = 0; i < n; i++) {
			System.out.println(array[i]);
			for(int j = i + 1; j < n; j++) {
				if(Integer.parseInt(array[i]) < Integer.parseInt(array[j])) {
					isCheck = true;
				}else {
					if(j == n - 1) {
						sb.append(-1).append(" ");
					}
					continue;
				}
				
				if(isCheck == true) {
					sb.append(array[j]).append(" ");
					break;
				}else {
					sb.append(-1).append(" ");
				}
			}
		}
		sb.setLength(sb.length()-1);
		System.out.println(sb);
		br.close();
	}
}
