package hackerrank_count_luck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Hackerrank_Count_Luck {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int t=r.nextInt();
       for(int gws=0;gws<t;gws++)
       {
       int n=r.nextInt();
       int m=r.nextInt();
       
       
       
       List<Integer>kj=new ArrayList<>();
       
       char[][] mn=new char[n][m];
       
       r.nextLine();
       int start=0,finish=0;
       int i=0;
       int gf=1;
       Map<Integer,Integer>gt=new HashMap<>();
       List<Integer>man[]=new LinkedList[n*m+1];
       int bd=0;
       for(int uh=0;uh<n;uh++)
       {
       String gh=r.nextLine();
       
       
       for(int h=0;h<gh.length();h++)
       {
         mn[i][h]=gh.charAt(h);
         man[bd]=new LinkedList<>();
         if(mn[i][h]!='X')
         {
         kj.add(gf);
         gt.put(gf, uh);
         if(mn[i][h]=='*')
         {
           finish=gf;
         }
         if(mn[i][h]=='M')
         {
           start=gf;
         }
         
         }
         bd++;
         gf++;
       }
       i++;
       }
       man[n*m]=new LinkedList<>();
       /*System.out.println(kj);
       System.out.println(start);
       System.out.println(finish);*/
       
       //System.out.println(gt);
       for(i=0;i<kj.size();i++)
       {
         int up=kj.get(i)-m;
         int down=kj.get(i)+m;
         int left=kj.get(i)-1;
         int right=kj.get(i)+1;
         //System.out.println("maeen");
        // if()
        /* if(kj.get(i)==33)
         {
           System.out.println(up);
           System.out.println(down);
           System.out.println(right);
           System.out.println(left);
         }*/
         
         if(gt.containsKey(up))
         {
           man[kj.get(i)].add(up);
         }
         if(gt.containsKey(down))
         {
           man[kj.get(i)].add(down);
         }
         if(gt.containsKey(right)&&kj.get(i)%m!=0)
         {
           man[kj.get(i)].add(right);
         }
         
         if(gt.containsKey(left)&&((kj.get(i)-1)%m!=0))
         {
           man[kj.get(i)].add(left);
         }
         
         
       }
//       System.out.println(man[33]);
       List<Integer>mf=new ArrayList<>();
       Stack<Integer>py=new Stack<>();
       Map<Integer,Integer>mane=new HashMap<>();
       for(int hb=0;hb<man[start].size();hb++)
       {
         mf.add(man[start].get(hb));
         mane.put(man[start].get(hb), hb);
         py.push(man[start].get(hb));
       }
      // System.out.println(py);
       
       int ha=0;
       mane.put(start, ha);
       /*for(i=0;i<mf.size();i++)
       {
         for(int hg=0;hg<man[mf.get(i)].size();hg++)
         {
           if(!mane.containsKey(man[mf.get(i)].get(hg)))
           {
             mf.add(man[mf.get(i)].get(hg));
             //System.out.print(man[mf.get(i)].get(hg)+" ");
             if((man[mf.get(i)].get(hg))==finish)
             {
               //System.out.println(finish);
               ha=1;
               break;
             }
             mane.put(man[mf.get(i)].get(hg), hg);
           }
         }
         System.out.println();
         if(ha==1)
         {
           break;
         }
       }*/
       //System.out.println(py.size());
       int fb=py.size();
       int total=0;
       for(i=0;i<fb;i++)
       {
         //System.out.println(py);
         int hn1=py.pop();
         //System.out.println(hn1);
         
         int z=0;
         for(int hg=0;hg<man[hn1].size();hg++)
         {
             
             
             
             
           if(!mane.containsKey(man[hn1].get(hg)))
           {
             //mf.add(man[hn1].get(hg));
             py.push(man[hn1].get(hg));
             //System.out.print(man[mf.get(i)].get(hg)+" ");
             if((man[hn1].get(hg))==finish)
             {
              // System.out.println("mollah");
               ha=1;
               z++;
               break;
             }
             mane.put(man[hn1].get(hg), hg);
             
             z++;
           }
             
             
             
         }
      
         if(z>=2)
         {
           total++;
         }
         
         if(ha==1)
         {
           break;
         }
         fb=py.size()+fb;
         
       }
       if(man[start].size()>=2)
       {
       total++;
       }
       
       System.out.println(total);
       int gi=r.nextInt();
       if(gi==total)
       System.out.println("Impressed");
       else
       System.out.println("Oops!");
       
       
       
       
       
       
       
       
    }
    
}
}