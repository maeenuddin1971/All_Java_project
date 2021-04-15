package codeforces_binary_string_reconstruction;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_Binary_String_Reconstruction {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int hq=r.nextInt();
        //r.nextLine();
        for(int hp=0;hp<hq;hp++)
        {
        r.nextLine();
        String gf=r.nextLine();
        
        int hf=r.nextInt();
        
        String bf=hen(gf,hf);
        
        System.out.println(bf);
        
        String gv=hen(bf,hf);
        
        System.out.println(gv);
        int hw=0;
        for(int i=0;i<bf.length();i++)
        {
            if(gf.charAt(i)!=gv.charAt(i))
            {
               System.out.println(-1);
               hw=1;
               break;
            }
        }
        if(hw==0)
        {
          System.out.println(bf);
        }
       
        //System.out.println(km);
       // System.out.println(hz);
        //System.out.println(jm);
       
        
    }
    
}
    
    public static String hen(String gf,int x)
    {
        String re="";
        
        int hz=0;
        for(int i=1;i<=gf.length();i++)
        {
           //km.put(gf.charAt(i),km.get(gf.charAt(i))+1);
           if(i>x&&gf.charAt(i-x-1)=='1')
           {
             re=re+'1';
           }
           else if(i+x<=gf.length()&&gf.charAt(i+x-1)=='1')
           {
             re=re+'1';
           }
           else
           {
            re=re+'0';
           }
        }
        
        return re;
    }
    
}