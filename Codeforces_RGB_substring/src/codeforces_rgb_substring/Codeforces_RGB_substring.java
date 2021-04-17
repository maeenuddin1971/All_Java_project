package codeforces_rgb_substring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_RGB_substring {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        String hb=r.nextLine();
        int mgf=0;
        List<String>ko=new ArrayList<String>();
        
        ko.add("RGB");
        ko.add("GBR");
        ko.add("BRG");
        ko.add("RG");
        ko.add("GB");
        ko.add("BR");
        
        for(int t=0;t<ko.size();t++)
        {
            boolean mnh=hb.indexOf(ko.get(t)) !=-1? true: false;
            
                    if (mnh==true)
                    {
                      System.out.println("maeen "+ko.get(t));
                      mgf=1;
                      break;
                      //mnh=false;
                    }
        }
    }
    
}
