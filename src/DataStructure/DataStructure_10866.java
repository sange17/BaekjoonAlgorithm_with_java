package DataStructure;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DataStructure_10866 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int deque[] = new int[n+1];
		int front = 0;
		int rear = 0;
		int size = 0;

		for(int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
			
			switch(str[0]) {
			case "push_front":
				deque[front] = Integer.parseInt(str[1]);
				front = (front-1+deque.length)%deque.length;
				size++;
				break;
			case "push_back":
				rear = (rear+1)%deque.length;
				deque[rear] = Integer.parseInt(str[1]);
				size++;
				break;
			case "pop_front":
				if(size == 0) System.out.println(-1);
				else {
					front = (front+1)%deque.length;
					System.out.println(deque[front]);
					deque[front] = 0;
					size--;
				}
				break;
			case "pop_back":
				if(size == 0) System.out.println(-1);
				else {
					System.out.println(deque[rear]);
					deque[rear] = 0;
					rear = (rear-1+deque.length)%deque.length;
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
				else System.out.println(deque[(front+1)%deque.length]);
				break;
			case "back":
				if(size == 0) System.out.println(-1);
				else System.out.println(deque[rear]);
				break;
			}
		}
		
		br.close();
	}
}
