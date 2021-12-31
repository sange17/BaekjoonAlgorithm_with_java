package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataStructure_10845 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
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
				if(size == 0) System.out.println(-1);
				else {
					front++;
					System.out.println(que[front]);
					que[front] = 0;
					size--;
				}
				break;
			case "size":
				System.out.println(size);
				break;
			case "empty":
				if(size == 0) System.out.println(1);
				else System.out.println(0);
				break;
			case "front":
				if(size == 0) System.out.println(-1);
				else System.out.println(que[front+1]);
				break;
			case "back":
				if(size == 0) System.out.println(-1);
				else System.out.println(que[rear]);
				break;
			}
		}
		
		br.close();
	}
}
