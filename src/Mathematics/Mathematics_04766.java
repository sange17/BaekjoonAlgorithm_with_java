package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_04766 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		double beforeTemperature = Double.parseDouble(br.readLine());
		double afterTemperature = 0.0;
		double temperature = 0.0;
		
		while(true) {
			
			afterTemperature = Double.parseDouble(br.readLine()); 
			
			if(afterTemperature == 999.0) {
				break;
			}
			
			temperature = afterTemperature - beforeTemperature;
			
			sb.append(String.format("%.2f", temperature) + "\n");
			
			beforeTemperature = afterTemperature;
		}
		
		System.out.println(sb);
		br.close();
	}
}
