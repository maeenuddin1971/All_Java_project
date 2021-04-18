package hackerrank_connected_cells_in_a_grid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_Connected_Cells_in_a_Grid {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int df=r.nextInt();
        int gf=r.nextInt();
        int[][] n=new int[df][gf];
        int bs=0;
        Map<Integer,Integer>kj=new HashMap<>();
        Map<Integer,Integer>kj2=new HashMap<>();
        List<Integer>mb=new ArrayList<>();
        for(int bd=0;bd<df;bd++)
        {
            for(int i=0;i<gf;i++)
            {
             n[bd][i]=r.nextInt();
             if(n[bd][i]==1)
             {
             mb.add(bs);
             kj2.put(bs, i);
             }
             bs++;
            }
        }
        //System.out.println(mb);
        int high=0;
        List<Integer>mn=new ArrayList<>();
        int bb=0;
        for(int i=0;i<mb.size();i++)
        {
          mn.clear();
          if(!kj.containsKey(mb.get(i)))
          {
           mn.add(mb.get(i));
           kj.put(mb.get(i),1);
           for(int gf2=0;gf2<mn.size();gf2++)
           {
             int v=mn.get(gf2);
             
             //System.out.println(v);
             
             
             int left=v-1;
             
             int down=v+gf;
             int right;
             
             int up=v-gf;
             
             int dig1=10000,dig2=100000;
             if(v%gf!=0)
             dig1=v+gf-1;
             
             dig2=v+gf+1;
             
             
             if(kj2.containsKey(dig1)&&!kj.containsKey(dig1))
             {
               mn.add(dig1);
               kj.put(dig1, v);
             }
             
             if(kj2.containsKey(dig2)&&!kj.containsKey(dig2))
             {
               mn.add(dig2);
               kj.put(dig2, v);
               
             }
             
             if((v-gf+1)%(gf)==0)
             {
             right=10000;
             }
             else
             {
              right=v+1;
             }
             //System.out.println(mn);
             //System.out.println(left+" "+right+" "+down);
             if(kj2.containsKey(left)&&!kj.containsKey(left))
             {
               mn.add(left);
               kj.put(left, v);
               //System.out.println(left);
             }
             
             if(kj2.containsKey(right)&&!kj.containsKey(right))
             {
               mn.add(right);
               kj.put(right, v);
               //System.out.println(right);
             }
             
             if(kj2.containsKey(down)&&!kj.containsKey(down))
             {
               mn.add(down);
               kj.put(down, v);
               //System.out.println(down);
             }
             
             if(kj2.containsKey(up)&&!kj.containsKey(up))
             {
               mn.add(up);
               kj.put(up, v);
               //System.out.println(down);
             }
             
             
             int updig1=1000,updig2=10100;
             if((v+1)%gf!=0)
             updig1=v-gf+1;
             
             if(v%gf!=0)
             updig2=v-(gf+1);
             
             if(kj2.containsKey(updig1)&&!kj.containsKey(updig1))
             {
               mn.add(updig1);
               kj.put(updig1, v);
               
             }
             
             if(kj2.containsKey(updig2)&&!kj.containsKey(updig2))
             {
               mn.add(updig2);
               kj.put(updig2, v);
               //System.out.println(updig2);
               //System.out.println(v);
             }
             
             
             
           }
           //System.out.println(mn);
           if(high<mn.size())
           {
             high=mn.size();
           }
           
          }        
        }
        System.out.println(high);
        
    }
    
}
