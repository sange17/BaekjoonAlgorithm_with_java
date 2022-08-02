package Implementation;

import java.util.Scanner;

public class Implementation_11365 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = sc.nextLine();
			
			if(str.equals("END")) {
				break;
			}
			
			char[] array = str.toCharArray();
			
			for(int i = array.length - 1; i >= 0; i--) {
				sb.append(array[i]);
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
