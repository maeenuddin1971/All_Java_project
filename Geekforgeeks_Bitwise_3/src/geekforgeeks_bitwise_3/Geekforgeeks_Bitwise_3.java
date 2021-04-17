package geekforgeeks_bitwise_3;

import java.util.Scanner;

public class Geekforgeeks_Bitwise_3 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        
        String gh=Integer.toBinaryString(t);
        //System.out.println(gh);
        int k=Integer.MAX_VALUE;
        for(int fd=gh.length()-1;fd>=0;fd--)
        {
           if(gh.charAt(fd)=='0')
           {
             k=fd; 
             break;
           }
            
            
        }
        
        if(k==Integer.MAX_VALUE)
        {
            String hb="";
            
            for(int hy=0;hy<gh.length();hy++)
            {
              hb=hb+'0';
            }
            hb='1'+hb;
           // System.out.println(hb);
            System.out.println(Integer.parseInt(hb,2));
            
        }
        else
        {
            
            String sub=gh.substring(0,k);
            //System.out.println(sub);
            sub=sub+'1';
            for(int ih=k+1;ih<gh.length();ih++)
            {
              sub=sub+'0';
            }
            
            System.out.println(Integer.parseInt(sub,2));
            
        }
        
        
    }
    
}
