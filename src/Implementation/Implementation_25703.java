package Implementation;

import java.util.Scanner;

public class Implementation_25703 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		sb.append("int a;\n");
		
		String beforeVar = "a";
		String currentVar = "";
		for(int i = 1; i <= N; i++) {
			
			sb.append("int ");
			for(int j = 0; j < i; j++) {
				sb.append("*");
			}
			
			if(i == 1) {
				currentVar = "ptr";
			}else {
				currentVar = "ptr" + i;				
			}
			
			sb.append(currentVar + " = &" + beforeVar + ";\n");
			
			beforeVar = currentVar;
		}
		
		System.out.println(sb.toString());
		sc.close();
	}
}
