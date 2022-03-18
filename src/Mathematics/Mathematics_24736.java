package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_24736 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int visitingScore = 0;
		int homeScore = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int visitingT = Integer.parseInt(st.nextToken()) * 6;
		int visitingF = Integer.parseInt(st.nextToken()) * 3;
		int visitingS = Integer.parseInt(st.nextToken()) * 2;
		int visitingP = Integer.parseInt(st.nextToken()) * 1;
		int visitingC = Integer.parseInt(st.nextToken()) * 2;
		visitingScore = visitingT + visitingF +visitingS + visitingP + visitingC;
		
		st = new StringTokenizer(br.readLine(), " ");
		int homeT = Integer.parseInt(st.nextToken()) * 6;
		int homeF = Integer.parseInt(st.nextToken()) * 3;
		int homeS = Integer.parseInt(st.nextToken()) * 2;
		int homeP = Integer.parseInt(st.nextToken()) * 1;
		int homeC = Integer.parseInt(st.nextToken()) * 2;
		homeScore = homeT + homeF + homeS + homeP + homeC;
		
		System.out.println(visitingScore + " " + homeScore);
		br.close();
	}
}
