package hackerrank_game_two_stacks;

import java.util.Scanner;

public class Hackerrank_game_two_stacks {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        
        
        for(int bg=0;bg<t;bg++)
        {
        int k=r.nextInt();
        int z=r.nextInt();
        
        int p=r.nextInt();
        
        int[] mn=new int[k];
        int[] mj=new int[z];
        
        for(int u=0;u<k;u++)
        {
            mn[u]=r.nextInt();
            
        }
        
        for(int y=0;y<z;y++)
        {
            mj[y]=r.nextInt();
        }
        int sum=0;
        int count=0;
        //System.out.println(p);
        for(int bd=0;bd<z;bd++)
        {
            
          if(sum>p)
          {
              sum=sum-mj[bd-1];
              break;
          }
          sum=sum+mj[bd]; 
          
          
          count++;
        }
        System.out.println(sum);
        
        
        for(int vb=0;vb<k;vb++)
        {
            
        }
        
        
        }
    }
    
}
