package codeforces_divide._it;
import java.util.Scanner;

public class Codeforces_Divide_it {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int se=r.nextInt();
       
       
      // System.out.println("here");
       for(int ef=0;ef<se;ef++)
       {
          
           
           
       String p=r.next();
       long t=Long.parseLong(p);
       //System.out.println("here");
       if(t!=1)
       {
       int g=0;
       int mf=0;
       for(;;)
       {
           int df=0;
           if(t%2==0)
           {
               t=t/2;
               df=1;
           }
           if((2*t)%3==0&&df==0)
           {
               t=(2*t)/3;
               df=2;
           }
           if((4*t)%5==0&&df==0)
           {
               t=(4*t)/5;
               df=4;
           }
           g++;
           if(t==1)
           {
               System.out.println(g);
               break;
           }
           
           if(df==0||t<1)    
           {
              mf=1;
            // System.out.println("yes");
              break;
           }
       }
       if(mf==1)
       {
           System.out.println(-1);
       }
       }
       else
           System.out.println(0);
       
       
       
       
       
       }
    }
    
}
