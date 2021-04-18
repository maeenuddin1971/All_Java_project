package hackerrank_forming_a_magic_square;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Hackerrank_Forming_a_Magic_Square {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int[][][] mn=
       {
           {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
           {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
           {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
           {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
           {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
           {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
           {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
           {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
       };
       int[][] m=new int[3][3];
       
       for(int i=0;i<3;i++)
       {
           for(int t=0;t<3;t++)
           {
               m[i][t]=r.nextInt();
           }
       }
       
       int sum=0;
       int min=1000000000;
       for(int u=0;u<8;u++)
       {
       sum=0;
       for(int i=0;i<3;i++)
       {
           for(int t=0;t<3;t++)
           {
            sum=sum+Math.abs(m[i][t]-mn[u][i][t]);   
           }
       }
       if(sum<min)
       {
           min=sum;
       }
       }
       System.out.println(min);
       
       
       
       
       
       
       
       
    }
    
}
