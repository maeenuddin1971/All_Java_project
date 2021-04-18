package hackerrank_cyclic_binary_string;

import java.math.BigInteger;
import java.util.Scanner;

public class Hackerrank_Cyclic_Binary_String {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        String gh=r.nextLine();
        
        
        int uh=0;
        if(gh.contains("0")&&gh.contains("1"))
        {
        if(gh.charAt(0)=='0')
        {
         for(;;)
         {
          if(gh.charAt(uh)!='0')
          {
           break;
          }
          else
          uh++;
         }
        }
        //System.out.println(uh);
        
        int gc=0;
        int gv=gh.length()-1;
        
        if(gh.charAt(gh.length()-1)=='0')
        {
          for(;;)
          {
            if(gh.charAt(gv)!='0')
            {
              break;
            }
            else
            {
             gc++;
             gv--;
            }
          }
        }
        //System.out.println(gc);
        //System.out.println(gv);
        int mx=gc+uh;
        
        
        for(int fc=uh;fc<=gv;fc++)
        {
           int gf=0;
           for(int ug=fc;ug<=gv;ug++)
           {
             if(gh.charAt(ug)=='0')
             {
               gf++; 
               fc++;
             }
             else
             {
               if(gf>mx)
               {
                mx=gf;
                
               }
               //System.out.println(gf);
               gf=0;
               break;
             }
           }
            
        }
        
        //System.out.println(mx);
        
        BigInteger b=new BigInteger(gh,2);
        System.out.println(b);
        System.out.println(mx);
        BigInteger k=new BigInteger("2");
        System.out.println(k.pow(mx));
        
        if(k.pow(mx).compareTo(b)==-1||k.pow(mx).compareTo(b)==0)
        {
          System.out.println(mx);
        }
        else
        {
          System.out.println(-1);
        }
        
        }
        else
        {
          System.out.println(0);
        }
        
        
    }
    
}
