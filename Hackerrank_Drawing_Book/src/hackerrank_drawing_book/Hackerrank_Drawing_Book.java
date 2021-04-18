package hackerrank_drawing_book;
import java.util.Scanner;
public class Hackerrank_Drawing_Book {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       int t=r.nextInt();
       
       int m=r.nextInt();
       
       if(t%2!=0&&(m!=1||m!=t))
       {
        if(m%2==0)
        {
           int k; 
           int z=m/2;
           if(t-m-1!=0)
           {
           k=(t-m-1)/2;
           }
           else
           {
            k=0;
           }
           if(z<k)
           {
               System.out.println(z);
           }
           else
           {
               System.out.println(k);
           }
        }
        else
        {
            int z=(m-1)/2;
            int k=(t-m)/2;
           if(z<k)
           {
               System.out.println(z);
           }
           else
           {
               System.out.println(k);
           }
        }
        
       }
       else if((m!=1||m!=t))
       {
        
           if(m%2==0)
           {
           int z=m/2;
           int k=(t-m)/2;
           //System.out.println(z+" "+k);  
           if(z<k)
           {
               System.out.println(z);
           }
           else
           {
               System.out.println(k);
           }
           }
           else
           {
             
           int k;    
           //System.out.println("maeen");    
           int z=(m-1)/2;
           
           if(t-m-1!=0)
           {
           k=(t-m-1+2)/2;
           }
           else
           {
               k=1;
           }
           //System.out.println(z+" "+k); 
           if(z<k)
           {
               System.out.println(z);
           }
           else
           {
               System.out.println(k);
           }
               
               
               
           }
           
           
           
       }
       else
       {
           System.out.println(0);
       }
    }
    
}
