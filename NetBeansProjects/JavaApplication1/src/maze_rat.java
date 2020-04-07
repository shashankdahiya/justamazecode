/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
      // Nice code bro..... pretty much copied. haha
/**
 *
 * @author shashankdahiya
 */
import java.util.*;
public class maze_rat {
 class GfG{
    int n=0;
    int[][] mat;
    String p="";
    boolean[][] visit;
    ArrayList<String> op;
     public ArrayList<String> printPath(int[][] m, int no)
     {
         op = new ArrayList<String>();
          if(no==0)
          return op;
          n = no;
          mat = new int[n][n];
          for(int i=0;i<n;i++){
              for(int j=0; j<n;j++)
                mat[i][j] = m[i][j];
          }
          visit = new boolean[n][n];
          
          visit[0][0]= true;
          path(0,0,visit,p);
          
          Collections.sort(op);
          return op;
          
     }
     public  void path(int i, int j, boolean[][] visit, String p){
         if(i==n && j==n){
             op.add(p);
             p="";
         }
         up(i,j,visit,p);
         right(i,j,visit,p);
         down(i,j,visit,p);
         left(i,j,visit,p);
         visit[i][j]= false;
         
        return; 
     }
     
     public  void up(int i, int j, boolean[][] visit, String p){
         if(safe(i-1,j)){
           visit[i-1][j]= true;
           p = p + "U";
           path(i-1,j,visit,p);
         }
         
     }
     public  void right(int i, int j, boolean[][] visit, String p){
         if(safe(i,j+1)){
             visit[i][j+1]=true;
             p+="R";
             path(i,j+1,visit,p);
         }
     }
     public  void down(int i, int j, boolean[][] visit, String p){
         if(safe(i+1,j)){
             visit[i+1][j]=true;
             p+="D";
             path(i+1,j,visit,p);
         }
     }
     public  void left(int i, int j, boolean[][] visit, String p){
        
         if(safe(i,j-1)){
             visit[i][j-1]=true;
             p+="R";
             path(i,j-1,visit,p);
         }
     }
     
     public  boolean safe(int i, int j){
         if(i>=0 && i<n && j>=0 && j<n && mat[i][j] ==1 && visit[i][j]==false) return true;
         
         return false;
     }
     
}   
}
