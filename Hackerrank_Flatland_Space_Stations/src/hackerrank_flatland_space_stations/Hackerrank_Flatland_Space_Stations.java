package hackerrank_flatland_space_stations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hackerrank_Flatland_Space_Stations {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int m=r.nextInt();
        
        int[] p=new int[m];
        List<Integer>kj=new ArrayList<Integer>();
        List<Integer>ty=new ArrayList<Integer>();
        List<Integer>dis=new ArrayList<Integer>();
        List<Integer>kj2=new ArrayList<Integer>();
        Map<Integer,Integer>mh=new HashMap<>();
        for(int i=0;i<m;i++)
        {
          kj.add(r.nextInt());
        }
        Collections.sort(kj);
        int high=0;
        int fui=999999999;
        for(int fe=0;fe<n;fe++)
        {
          if(kj.contains(fe))
          {
            continue;
          }
          else
          {
             fui=Math.abs(kj.get(0)-fe);
            // System.out.println(fui);
             for(int dt=1,hb=kj.size()-1;dt<kj.size();dt++,hb--)
             {
                 int sum1=Math.abs(kj.get(dt)-fe);
                
                 //int sum2=Math.abs(kj.get(hb)-fe);
                 if(fui<sum1)
                 {
                  // System.out.println(fui);
                   break;
                 }
                 else
                 {
                  fui=sum1;
                 }
                          
             }
             //System.out.println(fui);
             if(high<fui)
             {
                 high=fui;
             }
             
          }
        }
        System.out.println(high);
        
    }
}
