package hackerrank_alternating_characters;
import java.util.Scanner;
public class Hackerrank_Alternating_Characters {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        
        int fr=r.nextInt();
        r.nextLine();
        
        for(int i1=0;i1<fr;i1++)
        {
        String h=r.nextLine();
        
        char[] t=h.toCharArray();
        Character p=t[0];
        int sum=0,s=1;
        for(int i=1;i<t.length;i++)
        {
          if(p==t[i])
          {
            s++;
          }
          else
          {
            sum=s-1+sum;
            s=1;
            p=t[i];
          }
        }
        if(s!=1)
        {
         sum=s-1+sum;
        }
        
        
        
        System.out.println(sum);
    }
    
}
}