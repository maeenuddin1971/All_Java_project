package codeforces_stoned_game_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Codeforces_stoned_game_2 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        
        List<Integer>pk=new ArrayList<>();
        
        
        for(int i=0;i<t;i++)
        {
          pk.add(r.nextInt());
        }
        
        Collections.sort(pk);
       // Collections.reverse(pk);
        int win=10;
        int mh=Integer.MAX_VALUE;
        for(int ug=pk.size()-1;ug>=0;ug=ug-2)
        {
            try
            {
               // jodi duita shoman hoy
               if(pk.get(ug)==pk.get(ug-1))
               {
                  if(win==10)
                  win=1;
                  else
                  {
                  if(win==0)
                  win=0; 
                  else
                  win=1;
                  } 
                  System.out.println("pk is "+pk.get(ug)+" "+pk.get(ug-1)+" "+win);
               }
               else
               {
                   int ud=Math.max(pk.get(ug),pk.get(ug-1));
                   if(ud==mh)
                   {
                   int jg=Math.abs(pk.get(ug)-pk.get(ug-1))-1;
                   mh=jg;
                   System.out.println("maeen uddin");
                   if(jg!=0)
                   {
                       pk.add(0,jg);
                   }
                   Collections.sort(pk.subList(0,pk.size()-ug-2));
                //   Collections.reverse(pk);
                   System.out.println(pk);    
                       
                   }
                   else
                   {
                   int jg=Math.abs(pk.get(ug)-pk.get(ug-1))-1;
                   mh=jg;
                   if(jg!=0)
                   {
                      // pk.add(jg);
                       pk.add(0,jg);
                   }
                   System.out.println("ug is "+ug);
                   Collections.sort(pk.subList(0,pk.size()-ug-2));
                   System.out.println(pk);
                  if(win==10)
                  win=0;
                  else
                  {
                  if(win==1)
                  win=0;
                  else
                  win=1;
                  }
                   
               }
               }
            }
            catch(Exception ju)
            {
                
            }
        }
        System.out.println(win);
    }
    
}
