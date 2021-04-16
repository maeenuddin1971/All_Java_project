package codeforces_flip_the_bits;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_Flip_the_Bits {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int gf=r.nextInt();
       //String gh=r.nextLine();
       
       for(int ghp=0;ghp<gf;ghp++)
       {
       int th=r.nextInt();
       r.nextLine();
       String gh=r.nextLine();
       String hj=r.nextLine();
       //System.out.println(gh+" "+hj);
       Map<Character,Integer>pk=new HashMap<>();
       Map<Character,Integer>pk2=new HashMap<>();
       pk.put('0',0);
       pk.put('1',0);
       pk2.put('0',0);
       pk2.put('1',0);
       int hw=0;
       for(int hs=gh.length()-1;hs>=0;hs--)
       {
         if(gh.charAt(hs)==hj.charAt(hs))
         {
            /*System.out.println("hs s "+hs);
            System.out.println("maeen ");
            System.out.println(pk);
            System.out.println("pk2 is "+pk2);*/
            if(pk.get('0')==pk2.get('0')&&pk.get('1')==pk2.get('1'))
            {
              //continue;
              pk.put('0',0);
              pk.put('1',0);
              pk2.put('0',0);
              pk2.put('1',0);
            }
            else
            {
               //System.out.println(pk);
               hw=1;
               break;
            }
         }
         else
         {
          // System.out.println(pk);
           pk.put(gh.charAt(hs),pk.get(gh.charAt(hs))+1);
           pk2.put(hj.charAt(hs),pk2.get(hj.charAt(hs))+1);
           
           //System.out.println(hs+" is "+hj.charAt(hs));
           //System.out.println(hs+" maen "+gh.charAt(hs));
           //System.out.println(pk);
           //System.out.println(pk2);
         }
           
           
       }
       
      // System.out.println(pk);
      // System.out.println(pk2);
       if(hw==1)
       {
           System.out.println("No");
       }
       else
       {
          System.out.println("Yes");
       }
    }
    
}
}