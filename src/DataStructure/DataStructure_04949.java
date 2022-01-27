package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataStructure_04949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str = br.readLine();
			char array[] = str.toCharArray();
			char aArray[] = new char[array.length];
			char bArray[] = new char[array.length];
			int size = 0;
			
			if(array[0] == '.') {
				break;
			}else {
				for(int i = 0; i < array.length; i++) {
					if(array[i] == '(' || array[i] == '[' || array[i] == ')' || array[i] == ']') {
						aArray[size] = array[i];
						size++;
					}
				}
				
				size = 0;
				for(int j = 0; j < aArray.length; j++) {
					if(size == 0) {
						bArray[size] = aArray[j];
						size++;
					}else if(bArray[size-1] == '(' && aArray[j] == ')'){
						bArray[size-1] = '0';
						size--;
					}else if(bArray[size-1] == '('&& aArray[j] == '(') {
						bArray[size] = aArray[j];
						size++;
					}else if(bArray[size-1] == ')') {
						bArray[size] = aArray[j];
						size++;
					}
				}
			}
			
			if(size == 0) System.out.println("yes");
			else System.out.println("no");
		}
	}
}
