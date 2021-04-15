package codeforces_01_game;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_01_Game {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int hd=r.nextInt();
        r.nextLine();
       for(int uy=0;uy<hd;uy++)
       {
       String n=r.nextLine();
       char[] p=n.toCharArray();
       Map<Character,Integer>km=new HashMap<>();
       for(int i=0;i<n.length();i++)
       {
        if(!km.containsKey(p[i]))
        {
          km.put(p[i],1);
        }
        else
        {
          km.put(p[i],km.get(p[i])+1);
        }
       }
       //System.out.println(km);
       
       if(km.containsKey('0')&&km.containsKey('1'))
       {
          if(n.length()==2)
          {
            System.out.println("DA");
          }
          else
          {
            int hb=km.get('0');
            int hg=km.get('1');
            
            if(hb%2==0&&hg%2==0)
            {
              
              System.out.println("NET");
            }
            
            else if((hb%2==0&&hg%2!=0)||(hb%2!=0&&hg%2==0))
            {
              System.out.println("NET");
            }
            else
            {
             System.out.println("DA");   
            }
          }
       }
       else
       {
         System.out.println("NET");
       }
        
        
    }
    
}
}