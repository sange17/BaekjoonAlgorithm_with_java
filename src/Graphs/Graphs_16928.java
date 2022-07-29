package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graphs_16928 {
   static int count[] = new int[101];
   static int ladderSnake[] = new int[101];
   static boolean visited[] = new boolean[101];
   
   public static void main(String[] args) throws IOException{   
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());
      
      for(int i = 0; i < N + M; i++) {
         st = new StringTokenizer(br.readLine(), " ");
         int from = Integer.parseInt(st.nextToken());
         int to = Integer.parseInt(st.nextToken());
         ladderSnake[from] = to;
      }
      
      bfs();
   }

   private static void bfs() {
      Queue<Integer> que = new LinkedList<Integer>();
      que.offer(1);
      count[1] = 0;
      visited[1] = true;
      
      while(!que.isEmpty()) {
         int current = que.poll();
         if(current == 100) {
            System.out.println(count[current]);
            return;
         }
         
         for(int i = 1; i < 7; i++) {
            int x = current + i;
            if(100 < x) continue;
            if(visited[x]) continue;
            visited[x] = true;
            
            // 사다리 또는 뱀의 위치일 때
            if(ladderSnake[x] != 0) {
               if(!visited[ladderSnake[x]]) {
                  que.offer(ladderSnake[x]);
                  visited[ladderSnake[x]] = true;
                  count[ladderSnake[x]] = count[current] + 1;
               }
            }else {//       일반 위치일 떄
               que.offer(x);
               count[x] = count[current] + 1;
            }
         }
      }
   }
}