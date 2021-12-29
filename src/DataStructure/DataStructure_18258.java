package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataStructure_18258 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int que[] = new int[n];
		int front = 0;
		int rear = 0;
		int size = 0;
		
		for(int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
			switch(str[0]) {
			case "push":
				rear++;
				que[rear] = Integer.parseInt(str[1]);
				size++;
				break;
			case "pop":
				if(size == 0) sb.append(-1 + "\n");
				else {
					front++;
					sb.append(que[front] + "\n");
					que[front] = 0;
					size--;
				}
				break;
			case "size":
				sb.append(size + "\n");;
				break;
			case "empty":
				if(size == 0) sb.append(1 + "\n");
				else sb.append(0 + "\n");
				break;
			case "front":
				if(size == 0) sb.append(-1 + "\n");
				else sb.append(que[front+1] + "\n");
				break;
			case "back":
				if(size == 0) sb.append(-1 + "\n");
				else sb.append(que[rear] + "\n");
				break;
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
