package codeforces_juggling_letters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_Juggling_Letters {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int hx=r.nextInt();
        for(int up=0;up<hx;up++)
        {
        int t=r.nextInt();
        Map<Character,Integer>km=new HashMap<>();
        r.nextLine();
        for(int i=0;i<t;i++)
        {
         // r.nextLine();
          String gh=r.nextLine();
          //System.out.println(gh);
          for(int it=0;it<gh.length();it++)
          {
            if(!km.containsKey(gh.charAt(it)))
            {
              km.put(gh.charAt(it),1);
            }
            else
            {
              km.put(gh.charAt(it),km.get(gh.charAt(it))+1);
            }
          }
          
          
        }
        
       // System.out.println(km);
        int ha=0;
        for(Character fd='a';fd<='z';fd++)
        {
          if(km.containsKey(fd)&&km.get(fd)%t!=0)
          {
           // System.out.println(fd);
            ha=1;
            break;
          }
        }
        if(ha==0)
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