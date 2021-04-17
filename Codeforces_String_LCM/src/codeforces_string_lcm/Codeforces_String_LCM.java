package codeforces_string_lcm;

import java.util.Scanner;

public class Codeforces_String_LCM {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int mi=r.nextInt();
        r.nextLine();
        for(int th=0;th<mi;th++)
        {
        String gh=r.nextLine();
        String hg=r.nextLine();
        int gf=Math.max(gh.length(),hg.length());
        int g=Math.min(gh.length(),hg.length());
        String vc="",km="";
        if(gh.length()>hg.length())
        {
          vc=gh;
          km=hg;
        }
        else
        {
          vc=hg;
          km=gh;
        }
        
        if(!gh.contains("a")&&!hg.contains("a"))
        {
          int hz=lcm(gh.length(),hg.length());  
          for(int uh=0;uh<hz;uh++)
          {
              System.out.print("b");
          }
          System.out.println();
          
        }
        else if(!gh.contains("b")&&!hg.contains("b"))
        {
          int hz=lcm(gh.length(),hg.length());  
          for(int uh=0;uh<hz;uh++)
          {
              System.out.print("a");
          }
          System.out.println(); 
        }
        else
        {
          int gh2=lcm(gf,g);
          String vd="";
          for(int y=0;y<gh2/g;y++)
          {
            vd=vd+km;  
          }
          
          //System.out.println(vd);
          String gw="";
          int ih=0,kp=0;
          for(int yg=0;yg<gh2/gf;yg++)
          {
            gw=gw+vc;
            
          }
          
          if(gw.equals(vd))
          {
            System.out.println(vd);
          }
          else
          {
              System.out.println("-1");
          }
          
        }
        
        
        
    }
    }
    
    public static int lcm(int a,int b)
    {
      int lcm=0,max,step;  
       
      if(a > b){
         max = step = a;
      }
      else{
         max = step = b;
      }

      while(a!= 0) {
         if(max % a == 0 && max % b == 0) {
            lcm = max;
            break;
         }
         max += step;
      }
      //System.out.println("LCM of given numbers is :: "+lcm);
      return lcm;
    }
    
}
