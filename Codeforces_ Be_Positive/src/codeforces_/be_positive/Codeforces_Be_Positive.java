package codeforces_.be_positive;

import java.util.Scanner;

public class Codeforces_Be_Positive {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner r=new Scanner(System.in);
        
        int n=r.nextInt();
        
        int[] p=new int[n];
        
        int positive=0,negative=0;
        for(int i=0;i<p.length;i++)
        {
            p[i]=r.nextInt();
            if(p[i]==0)
            {
                
            }
            else if(p[i]>0)
            {
                positive++;
            }
            else if(p[i]<0)
            {
                negative++;
            }    
        }
        
        double j=(double)n;
        
        double m=(double) (j/2.0);
      //  System.out.println(m);
        
        double rt=n/2;
        
        if(rt<m)
        {
            
            rt++;
          //  System.out.println(rt);
            int u=(int)rt;
            if(positive>=rt)
            {
                u++;
                System.out.println(u);
            }
            else if(negative>=rt)
            {
               // u--;
                System.out.println("-"+u);
            }
            else
            {
                System.out.println(0);
            }
        }
        else if(rt==m)
        {
           
            int u=(int)rt;
            
            if(positive>=rt)
            {
                u++;
                System.out.println(u);
            }
            else if(negative>=rt)
            {
              //  u--;
                System.out.println("-"+u);
            }
            else
            {
                System.out.println(0);
            }
            
        }
        else
        {
            System.out.println(0);
        }
        
    }
    
}
