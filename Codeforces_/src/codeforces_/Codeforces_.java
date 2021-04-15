
package codeforces_;
public class Codeforces_ {
    public static void main(String[] args) {
        int res=0;
        
        String mb="+-++-----------";
        for(int in=0;in<=Integer.MAX_VALUE;in++)
        {
            int cur=in;
            boolean ok=true;
            
            for(int i=0;i<mb.length();i++)
            {
               System.out.print(i+" ");
               res=res+1;
               if(mb.charAt(i)=='+')
               {
                 cur=cur+1;
                 
               }
               else
               {
                 cur=cur-1;
               }
               
               if(cur<0)
               {
                   ok=false;
                   break;
               }
            }
            System.out.println();
            if(ok==true)
            {
              break;
            }
        }
        System.out.println(res);
        
    }
    
}
