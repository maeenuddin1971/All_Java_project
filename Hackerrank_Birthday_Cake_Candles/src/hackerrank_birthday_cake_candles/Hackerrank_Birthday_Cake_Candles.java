package hackerrank_birthday_cake_candles;
import java.util.*;
public class Hackerrank_Birthday_Cake_Candles {
    public static void main(String[] args) {
      Scanner r=new Scanner(System.in);
      
      int t=r.nextInt();
      
      List<Integer>nb=new ArrayList<Integer>();
      
      for(int y=0;y<t;y++)
      {
          nb.add(r.nextInt());
      }
      Collections.sort(nb);
      int cd=nb.get(t-1);
      int z=0;
      //System.out.println(nb.get(cd));
      for(int vf=nb.size()-1;vf>=0;vf--)
      {
      if(cd==nb.get(vf))
      {
        z++;  
      }
      else
      {
          break;
      }
      }
      System.out.println(z);
    }
    
}
