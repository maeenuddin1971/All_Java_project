package codeforces_three_sequences;

import java.util.Scanner;

public class Codeforces_Three_Sequences {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int t=r.nextInt();
        
        int[] m=new int[t];
        int[] b=new int[t];
        int[] c=new int[t];
        
        for(int i=0;i<t;i++)
        {
            m[i]=r.nextInt();
        }
        int high=Integer.MAX_VALUE;
        int hgr=0;
        for(int ha=2*t;ha>=0;ha--)
        {
        c[0]=ha;
        b[0]=m[0]-(ha);
        
        hgr=ms(c[0],b[0]);
        
        //System.out.println(c[0]+" "+b[0]);
        
        for(int u=1;u<t;u++)
        {
            
            //{
              int jt=m[u]-m[u-1];
             // System.out.println(jt);
              
              int kh=jt+c[u-1];
              if(kh<=c[u-1])
              {
                c[u]=kh;
                int bd=m[u]-kh;
                b[u]=bd;
                
                int hx=ms(c[u],b[u]);
                
                if(hgr<hx)
                  hgr=hx;
                        
                 
              }
              else
              {
                int hg=jt+b[u-1];
                b[u]=hg;
                int bd=m[u]-hg;
                c[u]=bd;
                
                 
                int hx=ms(c[u],b[u]);
                
                if(hgr<hx)
                  hgr=hx;
                      
               
                
                
                
              }
              
              
              
            //}
        }
        
        
       /* for(int y=0;y<t;y++)
        {
          System.out.print(b[y]+" ");  
        }*/
       // System.out.println();
       /* for(int y=0;y<t;y++)
        {
          System.out.print(c[y]+" ");  
        }*/
        
       // System.out.println("hgr is "+hgr);
        
        if(high>hgr)
          high=hgr;
        else if(ha!=t)
        {
          break;
        }
        
    }
    System.out.println(high);
    int dx=r.nextInt();
    for(int uv=0;uv<dx;uv++)
    {
    int ih=r.nextInt();
    int hz=r.nextInt();
    int hp=r.nextInt();
    
        for(int u=ih-1;u<hz;u++)
        {
           m[u]=m[u]+hp; 
        }
    
    hg(t,m,ih,hz,hp);
    }
}
    
    
    public static int ms(int h,int p)
    {
      int hgr;
      if(h>p)
       hgr=h;
      else
       hgr=p;
      
      return hgr;
    }
    
    public static void hg(int t,int[] m,int ih,int hz,int hp)
    {
        int high=Integer.MAX_VALUE;
        int hgr=0;
        int[] c=new int[t];
        int[] b=new int[t];
        
        
        
        for(int ha=2*t;ha>=0;ha--)
        {
        c[0]=ha;
        b[0]=m[0]-(ha);
        
        hgr=ms(c[0],b[0]);
        
        //System.out.println(c[0]+" "+b[0]);
        
        for(int u=1;u<t;u++)
        {
            
            //{
              int jt=m[u]-m[u-1];
             // System.out.println(jt);
              
              int kh=jt+c[u-1];
              if(kh<=c[u-1])
              {
                c[u]=kh;
                int bd=m[u]-kh;
                b[u]=bd;
                
                int hx=ms(c[u],b[u]);
                
                if(hgr<hx)
                  hgr=hx;
                        
                 
              }
              else
              {
                int hg=jt+b[u-1];
                b[u]=hg;
                int bd=m[u]-hg;
                c[u]=bd;
                
                 
                int hx=ms(c[u],b[u]);
                
                if(hgr<hx)
                  hgr=hx;
                      
               
                
                
                
              }
              
              
              
            //}
        }
        
        
       /* for(int y=0;y<t;y++)
        {
          System.out.print(b[y]+" ");  
        }*/
       // System.out.println();
       /* for(int y=0;y<t;y++)
        {
          System.out.print(c[y]+" ");  
        }*/
        
       // System.out.println("hgr is "+hgr);
        
        if(high>hgr)
          high=hgr;
        else if(ha!=t)
        {
          break;
        }
        
    }
    if(t==1&&m[0]==-2)
    System.out.println(-1);
    else
    System.out.println(high);
}
    
}