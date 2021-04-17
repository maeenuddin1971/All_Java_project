package geekforgeeks_egyptian_fraction;
public class Geekforgeeks_Egyptian_fraction {
    public static void main(String[] args) {
        int lb=8;
        int hr=14;
        System.out.println(hr+"/"+lb+" is");
        for(;;)
        {
          if((hr%lb)==0)
          {
            System.out.print(1+"/"+hr/lb);
            break;
          }
          int hg=lb;
          int hc=hr;
          int hx=hr/lb+1;
          hr=hx*hr;
          lb=(hr/hc)*hg-(hr/hx);
          
          System.out.print(1+"/"+hx+" ");
          
        }
        
        
    }
    
}
