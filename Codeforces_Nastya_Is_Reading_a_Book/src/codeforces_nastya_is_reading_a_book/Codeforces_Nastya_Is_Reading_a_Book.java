package codeforces_nastya_is_reading_a_book;
import java.util.*;
public class Codeforces_Nastya_Is_Reading_a_Book {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
       int u=r.nextInt();
       
       int[] jk=new int[u];
       int[] sw=new int[u];
       
       for(int y=0;y<u;y++)
       {
           jk[y]=r.nextInt();
           sw[y]=r.nextInt();
       }
       int m=r.nextInt();
       
       int sum=0;
       if(m==0)
       {
           System.out.println(sum);
       }
       else
       {
        for(int y=0;y<u;y++)
        {
            if(sw[y]<m)
            {
                sum++;
            }
            else
            {
                System.out.println(u-sum);
                break;
            }
        }
       }
       
    }
    
}
