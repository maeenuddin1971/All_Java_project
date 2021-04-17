package codeforces_playlist;
import java.util.*;
public class Codeforces_Playlist {
    public static void main(String[] args) {
      Scanner r=new Scanner(System.in);
      
      int p=r.nextInt();
      int y=r.nextInt();
      
      HashMap<Integer,Integer> c= new HashMap<Integer,Integer>();
      int[] op=new int[p];
      int[] ik=new int[p];
      for(int s=0;s<p;s++)
      {
          int fg=r.nextInt();
          int gf=r.nextInt();
          c.put(gf,fg);
          op[s]=gf;   
          //akahane moloto prtm gun ta kra hoiche
          ik[s]=fg*gf;
      }
      Arrays.sort(op);
      Arrays.sort(ik);
      int sum=ik[ik.length-1];
   //   System.out.println(sum);
      int sum2=0;
      if(y>1)
      {
      for(int de=2;de<=y;de++)
      {
         //ekhan theke kaj hsse j key kn prjnto select krbo gun krar jnno
         for(int t=0;t<p-1;t++)
         {
         sum2=c.get(op[t]);
         for(int sw=t+1;sw<p-de+1;sw++)
         {
             
             //ekhan theke hsse j koyta jug krbe
             for(int bf=sw;bf<sw+de;bf++)
             {
                 try
                 {
                    sum2=sum2+c.get(op[bf]);
                 }
                 catch(Exception jh)
                 {
                     
                 }
             }
             System.out.println(sum2);
         }
         }
      
      }
      }
      
    }
    
}
