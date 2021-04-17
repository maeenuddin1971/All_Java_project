package codeforces_string_similarity;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codeforces_String_Similarity {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int p=r.nextInt();
       
       for(int iy=0;iy<p;iy++)
       {
       int n=r.nextInt();
       r.nextLine();
       String gh=r.nextLine();
       
       char[] k=gh.toCharArray();
       int bf=0;
       Map<Integer,Integer>pk=new HashMap<>();
       int[] nf=new int[n];
       Character fr=k[0];
       //System.out.println("fgh "+fr);
       String rf="";
       int mrk=0;
       int man=1;
       for(int pj=0;pj<n;pj++)
       {
       if(pj!=0&&!pk.containsKey(pj))
       {
         fr=k[pj+bf];
        // System.out.println("fr is "+fr);
         man=1;
       }
       if(man==1)
       {
       for(int i=0;i<n;i++)
       {
          if(!pk.containsKey(i))
          {
            if(fr==k[i+bf])
            {
               pk.put(i,1);
               //System.out.print(i+" robi ");
            }
            
            mrk=1;
          }
          
          
       }
       
       man=0;
        if(mrk==1)
        {
          rf=rf+fr;
        }
        mrk=0;
          bf++;
          
         // System.out.println();
       
       
       
      // System.out.println(pk);
    }
   
    
    
}
       
    //System.out.println(rf);
    int vg=rf.length();
    for(int u=vg;u<n;u++)
    {
      rf=rf+'0';
    }
    System.out.println(rf);
       
}
}
}