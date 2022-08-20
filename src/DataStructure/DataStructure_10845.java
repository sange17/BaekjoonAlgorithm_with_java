package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class DataStructure_10845 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int queueLast = 0;
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
			String operation = str[0];
			
			switch(operation) {
			case "push":
				queueLast = Integer.parseInt(str[1]);
				queue.add(queueLast);
				break;
			case "pop":
				if(queue.size() == 0) {
					sb.append(-1 + "\n");
				}else {
					sb.append(queue.poll() + "\n");
				}
				break;
			case "size":
				sb.append(queue.size() + "\n");
				break;
			case "empty":
				if(queue.size() == 0) {
					sb.append(1 + "\n");
				}else {
					sb.append(0 + "\n");
				}
				break;
			case "front":
				if(queue.size() == 0) {
					sb.append(-1 + "\n");
				}else {
					sb.append(queue.peek() + "\n");
				}
				break;
			case "back":
				if(queue.size() == 0) {
					sb.append(-1 + "\n");
				}else {
					sb.append(queueLast + "\n");
				}
				break;
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
