package codeforces_stoned_game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Codeforces_Stoned_Game {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int ig=r.nextInt();
        
        for(int ha=0;ha<ig;ha++)
        {
        
        int h=r.nextInt();
        
        List<Integer>pk=new ArrayList<>();
        
        for(int i=0;i<h;i++)
        {
          pk.add(r.nextInt());
        }
        //Collections.sort(pk.subList(h, h));
        int win=10;
        int hx=0;
        int ht=1;
        int uf=0;
        for(int i=0;i<pk.size();i=i+2)
        {
            try
            {
               if(hx==i+1)
               {
                if(pk.get(i)>=pk.get(i+1))
                {
                  ht=1;
                  uf=1;
                }
                else
                {
                  if(win==1)
                  win=0;
                  else
                  win=1;
                  ht=0;
                  int jg=Math.abs(pk.get(i)-pk.get(i+1))-1;
                  uf=0;
                  if(jg!=0)
                  {
                    pk.add(jg);
                    hx=pk.size()-1;
                  }
                 // System.out.println(pk);
                  
                }
               }
                
               if(ht==1)
               {
               if((pk.get(i)==pk.get(i+1)))
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
                  uf=1;
                 // System.out.println("winner is "+win);
               }
               else
               {
                  uf=0;
                  int jg=Math.abs(pk.get(i)-pk.get(i+1))-1;
                  if(jg!=0)
                  {
                    pk.add(jg);
                    hx=pk.size()-1;
                  }
                 // System.out.println(pk);
                   
                  if(win==10)
                  win=0;
                  else
                  {
                  if(win==1)
                  win=0;
                  else
                  win=1;
                  }
                 // System.out.println("winner is "+win);
               }
               }
            }
            catch(Exception jh)
            {
                
            }
        }
        if(pk.size()==1)
        {
          
          System.out.println("T");
        }
        else
        {
        if(pk.size()%2==0)
        {
        //System.out.println(win);
            if(win==0)
            System.out.println("T");
            else
            System.out.println("HL");
            
        }
        else
        {
          if(uf==0)
          {
          if(win==1)
          System.out.println("Hl");
          else
          System.out.println("T");
          }
          else
          {
          if(win==1)
          System.out.println("T");
          else
          System.out.println("HL");  
          }
        }
        
       // System.out.println(uf);
        
    }
    
}
}
} 