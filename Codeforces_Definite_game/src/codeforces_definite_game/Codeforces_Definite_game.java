package codeforces_definite_game;
import java.util.*;
public class Codeforces_Definite_game {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        
        int vb=2;
        int gp=t;
        
        if(t!=1)
        for(;;)
        {
            if(gp%vb==0)
            {
             // System.out.println(vb);
               // continue;
            }
            else
            {   
              //  System.out.println(vb);
              if(gp-vb<0)
              {
             
              System.out.println(gp);
              break;
              }
              gp=gp-vb;  
               System.out.println(gp);
            }
            vb++;
             System.out.println("vb"+"="+vb);
            
            
        }
        else
            System.out.println("1");
        
    }
    
}
