package hackerrank_designer_pdf_viewer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Hackerrank_Designer_PDF_Viewer {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int[] mn=new int[26];
        Map<Character,Integer>b=new HashMap<>();
        
        for(char fd='a';fd<='z';fd++)
        {
          int xc=r.nextInt();
          b.put(fd,xc);
        }
        String vc=r.next();
        char[] m=vc.toCharArray();
        int u=0;
        for(int ds=0;ds<m.length;ds++)
        {
          int vd=b.get(m[ds]);
          if(u<vd)
          {
           u=vd;
          }        
        }
        System.out.println(u*(m.length));
        
        
    }
    
}
