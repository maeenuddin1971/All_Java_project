package codeforces_in_game_chat;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_In_game_Chat {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int p=r.nextInt();
        for(int hs=0;hs<p;hs++)
        {
        int h=r.nextInt();
        r.nextLine();
        String gh=r.nextLine();
        int gx=0;
        Map<Character,Integer>pk=new HashMap<>();
        pk.put(')',0);
        int gz=0;
        int vq=0;
        for(int uh=gh.length()-1;uh>=0;uh--)
        {
          if(gh.charAt(uh)!=')')
          {
            
            gz=uh;
            break;
            //gz=uh;
          }
          else
          {
             vq=1;
             pk.put(')',pk.get(')')+1);
          }
        }
        //System.out.println(gz);
        //System.out.println(pk.get(')'));
        if(vq==0)
        {
          System.out.println("No");
        }
        else
        if(gz==0)
        {
           System.out.println("Yes"); 
        }
        else if(gz+1>=pk.get(')'))
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