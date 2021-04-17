package geekforgeeks_bitwise_basic_one;
public class Geekforgeeks_bitwise_basic_one {
    public static void main(String[] args) {
        
        
        int[] arr={10,10,10,3,4,4};
        
        int on=0,tw=0;
        int cmn;
        //tw=tw|(on&arr[0]);
        //on=on^arr[0];
        //System.out.println(tw);
        //System.err.println(on);
        for(int i=0;i<arr.length;i++)
        {
          tw=tw|(on&arr[i]);  
          
          on=on^arr[i];
          
          cmn=~(on&tw);
          on &=cmn;
          
          tw &=cmn;
        }
        System.out.println(on);
        
        
    }
    
    /*public static int maeen()
    {
        
    }*/
    
}
