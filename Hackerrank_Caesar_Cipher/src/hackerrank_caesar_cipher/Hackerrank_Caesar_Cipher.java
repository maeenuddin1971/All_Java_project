package hackerrank_caesar_cipher;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_Caesar_Cipher {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        r.nextLine();
        String man=r.nextLine();
        
        int e=r.nextInt();
        Character f,u;
        Map<Character,Character>p=new HashMap<>();
        int fr=e%26;
        for(f='a',u='A';f<='z';f++,u++)
        {
           int s=0;
           Character bt=f;
           for(int ge=0;ge<fr;ge++)
           {
            if(bt=='z')
            {
             s=1;
             bt='a';
            }
            bt++;
           }
          if(s==1)
          bt--;
          p.put(f,bt);
          
          int nw=0;
          Character bt2=u;
          
          for(int ge=0;ge<fr;ge++)
          {
            if(bt2=='Z')
            {
             nw=1;
             bt2='A';
            }
            bt2++;
          }
          if(nw==1)
          bt2--;
          p.put(u,bt2);  
        }
        
        
      //  System.out.println(p);
        
        
        char[] mp=man.toCharArray();
        
        
        for(int fw=0;fw<mp.length;fw++)
        {
          if(p.containsKey(mp[fw]))
          {
              System.out.print(p.get(mp[fw]));
          }
          else
          {
            System.out.print(mp[fw]);
          }
        }
        
        
    }
    
}
