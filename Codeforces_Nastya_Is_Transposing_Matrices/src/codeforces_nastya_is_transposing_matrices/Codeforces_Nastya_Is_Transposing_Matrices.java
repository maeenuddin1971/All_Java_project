package codeforces_nastya_is_transposing_matrices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Codeforces_Nastya_Is_Transposing_Matrices {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        int n=r.nextInt();
        int m=r.nextInt();
        
        int[][] p=new int[n][m];
        int[][] gh=new int[n][m];
        List<Integer>gt=new ArrayList<Integer>();
        List<Integer>gt2=new ArrayList<Integer>();
        Map<Integer,Integer>iu=new HashMap<Integer,Integer>();
         Map<Integer,Integer>iu2=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            for(int y=0;y<m;y++)
            {
                p[i][y]=r.nextInt();
            }
        }
         for(int i=0;i<n;i++)
        {
            for(int y=0;y<m;y++)
            {
                gh[i][y]=r.nextInt();
            }
        }
         int sum=0;
         for(int i=0,j=n-1;i<n;i++,j--)
        {
            for(int y=0,k=m-1;y<m;y++,k--)
            {
                if(p[y][i]!=gh[i][y])
                {
                    
                    gt.add(p[y][i]);
                    iu.put(i,p[y][i]);
                    gt2.add(gh[i][y]);
                    iu2.put(y,gh[i][y]);
                  //  sum++;                  
                }
                else
                {
                                     
                }
            }
            
            
        }
         
         
       // System.out.println(gt);
        //System.out.println(gt2);
        
        //System.out.println(iu);
        //System.out.println(iu2);
        //System.out.println(iu.);
        // System.out.println(sum);
       
       // Set<Integer> pt=iu.keySet();
        int erw=0;
        for(int op:iu.keySet())
        {
            if(iu.get(op)!=iu2.get(op))
            {
                System.out.println("NO");
                erw=1;
                break;
            }
        }
        if(erw==0)
        {
            System.out.println("Yes");
        }
       
    }
    
}
