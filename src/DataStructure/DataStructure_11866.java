package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DataStructure_11866 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String array[] = br.readLine().split(" ");
		int n = Integer.parseInt(array[0]);
		int f = Integer.parseInt(array[1]);
		int count = 1;
		int numArray[] = new int[n];
		int front = 0;
		int queSize = n;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			numArray[i] = i+1;
		}
		
		sb.append("<");
		while(true) {
			if(queSize == 0) {
				sb.append(">");
				break;
			}
			
			if(numArray[front] != 0 && count == f) {
				if(queSize == 1) {
					sb.append(numArray[front]);					
				}else {
					sb.append(numArray[front]).append(", ");
				}
				numArray[front] = 0;
				queSize--;
				count = 1;
			}else if(numArray[front] != 0 && count != f) {
				front = (front+1)%numArray.length;
				count++;
			}else if(numArray[front] == 0 && count != f) {
				front = (front+1)%numArray.length;
			}else if(numArray[front] == 0 && count == f) {
				front = (front+1)%numArray.length;
			}			
		}
		System.out.println(sb);
		br.close();
	}
}
