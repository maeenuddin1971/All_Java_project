package codeforces_cofee_break;

import java.util.Scanner;
import java.util.*;
public class Codeforces_Cofee_Break {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int t=r.nextInt();
        int cv=r.nextInt();
        int sx=r.nextInt();
        
        HashMap<Integer,Integer>m=new HashMap<>();
          HashMap<Integer,Integer>m2=new HashMap<>();
        int[] a=new int[t];
        int[] it=new int[t];
        for(int az=0;az<t;az++)
        {
            a[az]=r.nextInt();
            it[az]=a[az];
        }
        Arrays.sort(it);
        
         boolean[] b=new boolean[t];
        
        for(int vb=0;vb<t;vb++)
        {
            b[vb]=false;
           // System.out.println(it[vb]);
        }
        int z=1;
        
        int live;
        for(int az=0;az<t;az++)
        {
            int sum=0;
            live=az;
            sum=it[az]+sx;
           // System.out.println("yesss");
            int p;
            for(int qa=0;qa<t;qa++)
            {
               // System.out.println("yedssss");
                if(sum<it[qa]&&sum<=cv)
                {
                    //System.out.println("yessss");
                    b[live]=true;
                    b[qa]=true;
                    m2.put(it[live],it[qa]);
                    System.out.println(it[live]+" "+it[qa]);
                    m.put(it[live],z);
                    m.put(it[qa],z);
                   z++;
                   break;
                }
            }
           
           // System.out.println();       
        }
        
        
        
        
        
         for(int vb=0;vb<t;vb++)
        {
            if(b[vb]==false)
            {
                m.put(it[vb],z);
                z++;
               // System.out.println(it[vb]);
            }
        }
         
         for(int cv1=0;cv1<t;cv1++)
        {
            int asq=m2.get(a[cv1]);
            System.out.println(asq);
            for(int g=cv1+1;g<t;g++)
            {
                if(m2.containsKey(asq))
                {
                    System.out.println("cznlnzfn");
                }
            }
        }
         
         
        
        /* for(int vb=0;vb<t;vb++)
         {
            
         }
         */
        
        /* for(int vb=0;vb<t;vb++)
         {  
             System.out.print(m.get(a[vb])+" ");
         }
        
        */
    }
    
}
