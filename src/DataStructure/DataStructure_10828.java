package DataStructure;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DataStructure_10828 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String array[] = new String[2];
		int stack[] = new int[n];
		int top = 0;
		
		for(int i = 0; i < n; i++) {
			array = br.readLine().split(" ");
			
			switch(array[0]) {
			case "push":
				stack[top] = Integer.parseInt(array[1]);
				top++;
				break;
			case "pop":
				if(top == 0) {
					System.out.println("-1");
				}else {
					System.out.println(stack[top-1]);
					stack[top] = 0;
					top--;
				}
				break;
			case "size":
				System.out.println(top);
				break;
			case "empty":
				if(top == 0) System.out.println("1");
				else System.out.println("0");
				break;
			case "top":
				if(top == 0) {
					System.out.println("-1");
				}else {
					System.out.println(stack[top-1]);
				}
				break;
			}
		}
	}
}
