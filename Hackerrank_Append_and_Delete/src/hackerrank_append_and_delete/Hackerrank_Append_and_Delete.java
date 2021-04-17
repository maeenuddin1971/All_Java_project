package hackerrank_append_and_delete;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Hackerrank_Append_and_Delete {
    public static void main(String[] args) {
      Scanner r=new Scanner(System.in);
      String b=r.nextLine();
      String c=r.nextLine();
      char[] p=b.toCharArray();
      char[] m=c.toCharArray();
      Map<Integer,String>fr=new HashMap<>();
      int y=1;
      int be=0;
      int a=0;
      int dc=r.nextInt();
      if(b.length()>=c.length())
      {
      for(int u=1;u<=m.length;u++)
      {
       String df=c.substring(be,u);
       if(b.contains(df))
       {
        if(a<df.length())
        {
          a=df.length();
          fr.put(a,df);
        }
        //fr.put(be, df)
       }
       else
       {
        be=u-1; 
       // System.out.println(df);
       }
       
      }
      //System.out.println(fr.get(a));
      int kj=b.length();
      int yt=c.length();
      int cx=fr.get(a).length();
      int vh=kj-cx;
      int kh=yt-cx;
      int sum=vh+kh;
      
      
     //System.out.println(vh+" "+kh);
      
      if(dc>=sum)
      System.out.println("Yes");
      else
          System.out.println("No");
      }
      else
      {
          System.out.println("No");
      }
    }
    
    
}
