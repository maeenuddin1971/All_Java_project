package codeforces_cards_for_friends;

import java.util.Scanner;

public class Codeforces_Cards_for_Friends {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int p=r.nextInt();
        
        for(int iu=0;iu<p;iu++)
        {
        int t=r.nextInt();
        int m=r.nextInt();
        int z=r.nextInt();
        
        int uh=1;
        int hw=t;
        for(;;)
        {
          if(t%2!=0)
          {
            uh=hw/t;
            break;
          }
          else
          {
           //uh++;
           t=t/2;
          }
        }
        
        
        //System.out.println(uh);
        
        
        int jh=1;
        
        int ad=m;
        for(;;)
        {
            if(m%2!=0)
            {
              jh=ad/m;
              break;
            }
            else
            {
              ///jh++;
              m=m/2;
            }
        }
        
        //System.out.println(jh);
        
        
        //System.out.println(jh*uh);
        
        if(jh*uh>=z)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
    }
    
}
}