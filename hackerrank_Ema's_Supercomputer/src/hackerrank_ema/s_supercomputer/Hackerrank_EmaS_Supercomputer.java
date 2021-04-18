package hackerrank_ema.s_supercomputer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_EmaS_Supercomputer {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int n=r.nextInt();
       int t=r.nextInt();
       r.nextLine();
       int[][] p=new int[n][t];
       char[][] k=new char[n][t];
       String[] b=new String[n];
       for(int i=0;i<n;i++)
       {
        b[i]=r.next();
       }
       int sum=0;
       
       List<String>vg=new ArrayList<>();
       List<Integer>vg3=new ArrayList<>();
       Map<String,String>kt=new HashMap<>();
       Map<String,Integer>kt2=new HashMap<>();
       Map<String,String>km=new HashMap<>();
       String part;
       //System.out.println(kt);
       for(int i=1;i<n;i++)
       {
         for(int dq=0;dq<b[i].length();dq++)
         {
           sum=0;
           
           if(b[i].charAt(dq)=='G')
           {
             int left=dq;
             int right=dq;
             int up=i;
             int down=i;
            // int under=dq;
             part="";
             for(;;)
             {
             try
             {
              if(b[i].charAt(left-1)=='G'&&b[i].charAt(right+1)=='G'&&b[up-1].charAt(dq)=='G'&&b[down+1].charAt(dq)=='G')
              {
                part=part+Integer.toString(i)+Integer.toString(left-1)+"t"+Integer.toString(i)+Integer.toString(right+1)+"t";
                part=part+Integer.toString(up-1)+Integer.toString(dq)+"t"+Integer.toString(down+1)+Integer.toString(dq)+"t";
                sum++;
                left--;
                right++;
                up--;
                down++;
                
              } 
              else
              {
                 System.out.println(sum); 
                 if(sum>=1)
                 {
                   String maeen=Integer.toString(i)+Integer.toString(dq);
                   System.out.println(part);
                   System.out.println("maeen "+maeen);
                   kt.put(maeen,part);
                   kt2.put(maeen,sum);
                   vg3.add(sum);
                   vg.add(maeen);
                 }
                 
                 
                 break; 
              }
             }
             catch(Exception jy)
             {
              System.out.println(sum); 
              
              
                 if(sum>=1)
                 {
                   String maeen=Integer.toString(i)+Integer.toString(dq);
                   System.out.println(part);
                   System.out.println("maeen "+maeen);
                   kt.put(maeen,part);
                   kt2.put(maeen,sum);
                   vg3.add(sum);
                   vg.add(maeen);
                 }
              
              
              
              break; 
             }
             }
           }
           
         }
       }
       System.out.println(kt);
       System.out.println(vg);
       Collections.sort(vg3);
       System.out.println(vg3);
       System.out.println(kt2);
       int rsum=0;
       
       
       for(int gv=0;gv<vg.size();gv++)
       {
       String fdt=vg.get(gv);
       for(int fsd=0;fsd<vg.size();fsd++)
       {
       String fdt2=vg.get(fsd);
       int test=0;
       for(int fr=0;fr<n;fr++)
       {
        for(int ty=0;ty<t;ty++)
        {
           String mar=Integer.toString(fr)+Integer.toString(ty);
           if((kt.get(fdt).contains(mar)&&kt.get(fdt2).contains(mar))||kt.get(fdt).contains(fdt2))
           {
             //System.out.println("maeen "+mar);
             System.out.print(fdt2+" ");
             test=1;
             break;
           }
           else if(vg.contains(fdt2))
           {
             System.out.println("aiche re "+fdt2);
           }
        }
        if(test==1)
        {
            break;
        }
       }
       //System.out.println();
       
       
       
       }
       System.out.println();
       }
    }
    
}
