package DataStructure;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DataStructure_02161 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int array[] = new int[1001];
		int queSize = array.length;
		int size = n;
		int front = 0;
		int rear = n;
		
		for(int i = 1; i <= n; i++) {
			array[i] = i;
		}

		for(int j = 0; j < n; j++) {
			if(size == 1) {
				sb.append(array[front+1]);
				System.out.println(sb);
				break;
			}else {
				front = (front+1) % queSize;
				sb.append(array[front]).append(" ");
				array[front] = 0;
				size--;
				rear = (rear+1) % queSize;
				array[rear] = array[front+1];
				front = (front+1) % queSize;
			}
		}
	}
}

