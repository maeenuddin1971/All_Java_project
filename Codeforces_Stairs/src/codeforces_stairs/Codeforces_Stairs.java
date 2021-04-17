package codeforces_stairs;

import java.util.Scanner;

public class Codeforces_Stairs {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        long hd=r.nextInt();
        for(int td=0;td<hd;td++)
        {
        long t=r.nextLong();
        
        long ig=0;
        long hx=0;
        long sum=0;
        long str=0;
        for(;;)
        {
          
          
          //sum++;
          long gd=(int)Math.pow(2,ig);
          hx=hx+gd;
          str=str+hx*gd;
          //System.out.println(str);
          if(str>t)
          {
              break;
          }
          sum++;
          
          ig++;
        }
        System.out.println(sum);
    }
    
}
}