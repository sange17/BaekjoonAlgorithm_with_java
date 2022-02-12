package BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BruteForce_18111 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int row = Integer.parseInt(st.nextToken());
		int column = Integer.parseInt(st.nextToken());
		int inventory = Integer.parseInt(st.nextToken());
		
		int array[][] = new int[row][column];
		int tmpArray[][] = new int[row][column];
		int blockSum = 0;
		int area = row * column;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < column; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
				blockSum += array[i][j];
			}
		}
		
		int allBlockSum = inventory + blockSum;
		int maxFloor = allBlockSum / area;
		
		int timeArray[] = new int[maxFloor+1];
		int digTime = 0;
		int fillTime = 0;
		
		int f = 0;
		while(maxFloor >= 0) {
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < column; j++) {
					tmpArray[i][j] = array[i][j] - maxFloor;
					if(tmpArray[i][j] > 0) {
						digTime += (tmpArray[i][j] * 2);
					}else if(tmpArray[i][j] < 0) {
						fillTime += (tmpArray[i][j] * -1);
					}
				}
			}

			timeArray[f] = digTime + fillTime;
			digTime = 0;
			fillTime = 0;
			f++;
			maxFloor--;
		}
		
		int height = 0;
		for(int i = 0; i < allBlockSum / area + 1; i++) {
			if(timeArray[i] < min) {
				min = timeArray[i];
				height = allBlockSum / area - i;
			}
		}
		
		System.out.println(min + " " + height);
		br.close();
	}
}
