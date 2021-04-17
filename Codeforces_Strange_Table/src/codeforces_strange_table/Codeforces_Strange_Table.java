package codeforces_strange_table;

import java.math.BigInteger;
import java.util.Scanner;

public class Codeforces_Strange_Table {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int tg=r.nextInt();
        for(int iv=0;iv<tg;iv++)
        {
        BigInteger t=r.nextBigInteger();
        BigInteger m=r.nextBigInteger();
        BigInteger x=r.nextBigInteger();
        BigInteger ro;
        BigInteger ph;
        if(x.mod(t).equals(BigInteger.valueOf(0)))
        {
          ro=x.divide(t);
          //System.out.println(ro);
          ph=t;
        }
        else
        {
          ro=x.divide(t).add(BigInteger.valueOf(1));
          ph=x.mod(t);
        }
        
        //System.out.println(ro+" "+ph);
        
       // int gf=ro+Math.abs(m*(ph-1));
        BigInteger gf=ro.add(m.multiply(ph.subtract(BigInteger.valueOf(1))));
        System.out.println(gf);
        
        
    }
    
}
}