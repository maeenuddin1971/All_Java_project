package codeforces_saving_the_city;
import java.util.Scanner;
public class Codeforces_Saving_the_City {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int imr=r.nextInt();
       
       for(int ip=0;ip<imr;ip++)
       {
       
       
       
       int h=r.nextInt();
       int p=r.nextInt();
       r.nextLine();
       
       
       
       String gh=r.nextLine();
       
       
       int km=0;
       
       
       int ty=0;
       for(int i=0;i<gh.length();i++)
       {
         int jc=0;
         if(gh.charAt(i)=='1')
         {
           //System.out.println("robi");
           //int y=i;
           //km=km+h;
           jc=5;
           int im=0;
           for(int y=i;y<gh.length();y++)
           {
           //System.out.println("y "+gh.charAt(y));
           try
           {
             if(gh.charAt(y)=='0'&&gh.charAt(y+1)=='0')
             {
               //System.out.println("maeen");
               if(im==0)
               {
                 int costw=h;
                 //System.out.println("ty is "+ty);
                 ty=ty+costw;
                 //System.out.println("ty os "+ty);
               }
               
               jc=1;
               break;
             }
             else if(gh.charAt(y)=='0')
             {
                // System.out.println("aihe");
                 im=1;
                 int cost1=0,cost2=0;
                 jc=1;
                 cost1=2*h;
                 cost2=p+h;
                 
                 ty=ty+Math.min(cost1,cost2);
                // System.out.println("cost is "+ty);
                // System.out.println(cost1+" "+cost2);
                 try
                 {
                   // System.out.println("shofiq");
                    int m=y+1;
                    for(int tt=m;tt<gh.length();tt++)
                    {
                      //System.out.println("amiy");
                      y++;
                     // System.out.println("ys ois "+y);
                      if(gh.charAt(tt)=='0')
                      {
                        break;
                      }
                      
                    }
                    //y=y+1;
                    
                 }
                 catch(Exception ju)
                 {
                   //break;  
                 }
                 i=y+1;
                 break;
                 
                 
             }
             
           }
           catch(Exception jy)
           {
             ty=ty+h; 
             //System.out.println("ex 2"+ty);
             jc=0;
           }
           i=y;
           }
           
         }
         
         if(jc==5)
         {
           ty=ty+h;
           //System.out.println("ex "+ty);
         }
         //System.out.println("ami"); 
         
       }
       System.out.println(ty);
       
       
       
       
       
       
       
    }
    
}
}
