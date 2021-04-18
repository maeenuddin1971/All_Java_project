package hackerrank_goodland_electricity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hackerrank_Goodland_Electricity {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        int z=r.nextInt();
        int[] m=new int[t];
        
        for(int g=0;g<t;g++)
        {
          m[g]=r.nextInt();
        }
        
        //int hc=((z-1)*2+1);
       // System.out.println(hc);
        int ph=z-1;
       // System.out.println(ph);
        int sum=0;
        int mf=0;
        List<Integer>km=new ArrayList<>();
        for(int i=0;i<t;i++)
        {
          //System.out.println(i);
          int y=i+ph;
          int gh=0;
          if(i<t&&y>t-1)
          {
            for(;;)
            {
              if(y==t-1)
              {
                break;
              }
              else
              {
               // System.out.println("shagor");
                y--;
              }
            }
          }
          
          if(m[y]==1)
          {
            sum++;
            i=y+ph;
            gh=1;
            km.clear();
            km.add(i);
          //  break;
          }
          else
          {
            int hp=0;
            if(!km.isEmpty())
            {
             hp=km.get(0);
            }
            for(int h=y;h>hp;h--)
            {
              if(m[h]==1)
              {
               //System.out.println("h is "+h);
               sum++;
               i=h+ph;
               //System.out.println("is is "+i);
               km.clear();
               km.add(i);
               gh=1;
               break;
              }
              
            }
          }
          
          if(gh==0)
          {
            //System.out.println("maeen");
            mf=1;
            break;
          }
        }
        if(mf==1)
        {
          System.out.println(-1);
        }
        else
        {
          System.out.println(sum);
        }
        
       //System.out.println(sum);
    }
    
}
