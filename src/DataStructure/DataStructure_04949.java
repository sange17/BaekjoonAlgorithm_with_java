package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataStructure_04949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine();
			char strArray[] = str.toCharArray();
			char stack[] = new char[strArray.length];
			int size = 0;
			
			if(strArray[0] == '.') break;
			
			for(int i = 0; i < strArray.length; i++) {
				if(strArray[i] == '(') {
					stack[size] = strArray[i];
					size++;
				}else if(strArray[i] == ')') {
					if(size == 0) {
						stack[size] = strArray[i];
						size++;
					}else if(size != 0) {
						if(stack[size-1] == '(') {
							size--;
						}else {
							stack[size] = strArray[i];
							size++;
						}
					}
				}else if(strArray[i] == '[') {
					stack[size] = strArray[i];
					size++;
				}else if(strArray[i] == ']') {
					if(size == 0) {
						stack[size] = strArray[i];
						size++;
					}else if(size != 0) {
						if(stack[size-1] == '[') {
							size--;
						}else {
							stack[size] = strArray[i];
							size++;
						}
					}
				}
			}
			
			if(size == 0) sb.append("yes").append("\n");
			else sb.append("no").append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
