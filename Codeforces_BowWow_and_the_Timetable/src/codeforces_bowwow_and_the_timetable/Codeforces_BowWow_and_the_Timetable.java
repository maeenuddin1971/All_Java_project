package codeforces_bowwow_and_the_timetable;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Codeforces_BowWow_and_the_Timetable {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       BigInteger pk=r.nextBigInteger(2);
      System.out.println(pk);
       
       double t=0;
       double hb=4;
       for(;;)
       {
         double sum=Math.pow(hb,t);
         BigInteger k = BigDecimal.valueOf(sum).toBigInteger();
         System.out.println(k);
         if(pk.compareTo(k)==1)
         {
            t++;
         }
         else
         {
             int yh=(int)Math.round(t);
             System.out.println(yh);
             break;
         }
         //t++;
       }
       
       
       
       
       
    }
    
}
