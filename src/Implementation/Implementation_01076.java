package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Implementation_01076 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		
		long result = 0;
		
		for(int i = 0; i < 3; i++) {
			
			str = br.readLine();
			
			if(i == 2) {
				
				if(str.equals("black")) {
					result = Long.parseLong(sb.toString()) * 1;
				}else if(str.equals("brown")) {
					result = Long.parseLong(sb.toString()) * 10;
				}else if(str.equals("red")) {
					result = Long.parseLong(sb.toString()) * 100;
				}else if(str.equals("orange")) {
					result = Long.parseLong(sb.toString()) * 1000;
				}else if(str.equals("yellow")) {
					result = Long.parseLong(sb.toString()) * 10000;
				}else if(str.equals("green")) {
					result = Long.parseLong(sb.toString()) * 100000;
				}else if(str.equals("blue")) {
					result = Long.parseLong(sb.toString()) * 1000000;
				}else if(str.equals("violet")) {
					result = Long.parseLong(sb.toString()) * 10000000;
				}else if(str.equals("grey")) {
					result = Long.parseLong(sb.toString()) * 100000000;
				}else if(str.equals("white")) {
					result = Long.parseLong(sb.toString()) * 1000000000;
				}
				
				break;
			}
			
			if(str.equals("black")) {
				sb.append(0);
			}else if(str.equals("brown")) {
				sb.append(1);
			}else if(str.equals("red")) {
				sb.append(2);
			}else if(str.equals("orange")) {
				sb.append(3);
			}else if(str.equals("yellow")) {
				sb.append(4);
			}else if(str.equals("green")) {
				sb.append(5);
			}else if(str.equals("blue")) {
				sb.append(6);
			}else if(str.equals("violet")) {
				sb.append(7);
			}else if(str.equals("grey")) {
				sb.append(8);
			}else if(str.equals("white")) {
				sb.append(9);
			}
			
		}
		
		System.out.println(result);
		br.close();
	}
}
