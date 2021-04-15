package codeforces_alexey_and_train;
import java.util.Scanner;
public class Codeforces_Alexey_and_Train {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int cv=r.nextInt();
        
        
        for(int ub=0;ub<cv;ub++)
        {
        int t=r.nextInt();
        int[] b=new int[t];
        int[] h=new int[t];
        int[] p=new int[t];
        for(int i=0;i<t;i++)
        {
          b[i]=r.nextInt();
          h[i]=r.nextInt();
        }
        
        for(int y=0;y<t;y++)
        {
           p[y]=r.nextInt();
        }
        
        int gb=b[0]+p[0];
        if(gb<h[0]||t>1)
        {
        if((h[0]-b[0])%2==0)
        {
            gb=gb+(h[0]-b[0])/2;
        }
        else
        {
            gb=gb+(h[0]-b[0])/2+1;
        }
        }
       // System.out.println(gb);
        if(gb<h[0])
        {
         gb=h[0];   
        }
        for(int uh=1;uh<t;uh++)
        {
          int fg=b[uh]-h[uh-1]+p[uh];
          //System.out.println("fg is "+fg);
          gb=gb+fg;
          int kh=(h[uh]-b[uh])/2;
          //System.out.println("gb is "+gb);
          if(uh!=t-1)
          {
          if((h[uh]-b[uh])%2!=0)
          {
           if(kh!=1)
           kh++; 
          }
          gb=gb+kh;
          if(gb<h[uh]&&uh!=t-1)
          {
            gb=h[uh];
          }
          }
        }
        
        System.out.println(gb);
        
    }
    
}
}