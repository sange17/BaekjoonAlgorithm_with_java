package Implementation;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Implementation_05622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char array[] = br.readLine().toCharArray();
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] >= 65 && array[i] <= 67) {
				count += 3;
			}else if(array[i] >= 68 && array[i] <= 70) {
				count += 4;
			}else if(array[i] >= 71 && array[i] <= 73) {
				count += 5;
			}else if(array[i] >= 74 && array[i] <= 76) {
				count += 6;
			}else if(array[i] >= 77 && array[i] <= 79) {
				count += 7;
			}else if(array[i] >= 80 && array[i] <= 83) {
				count += 8;
			}else if(array[i] >= 84 && array[i] <= 86) {
				count += 9;
			}else if(array[i] >= 87 && array[i] <= 90) {
				count += 10;
			}
		}
		System.out.println(count);
	}
}
