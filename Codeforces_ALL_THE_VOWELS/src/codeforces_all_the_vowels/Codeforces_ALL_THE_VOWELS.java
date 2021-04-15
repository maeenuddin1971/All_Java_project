package codeforces_all_the_vowels;
import static java.sql.Types.NULL;
import java.util.*;
public class Codeforces_ALL_THE_VOWELS {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int z=0;
        int t=r.nextInt();
        char[] bn=new char[t];
        
        
        List<String>tyu=new ArrayList<>();
        
        tyu.add("a");
        tyu.add("e");
        tyu.add("i");
        tyu.add("o");
        tyu.add("u");
        
        
        
        
        if(t<25)
        {
            System.out.println(-1);
        }
        else
        {
            for(int s=5;;s++)
            {
               // int s=5;
                if(t%s==0)
                {
                    int ed=t/s;
                    System.out.println(ed+" "+s);
                    
                    int bh=0;
                    for(int yh=5;yh<s;yh++)
                    {
                        if(yh%5==0&&yh!=5)
                        {
                            bh=0;
                        }
                        
                        bn[yh]=tyu.get(bh).charAt(0);
                        
                        bh++;
                    }
                    
                    
                    
                   
                    bn[0]='a';
                    bn[1]='e';
                    bn[2]='i';
                    bn[3]='o';
                    int uy=1;
                    bn[4]='u';
                    System.out.println(t);
                    for(int df=0;df<t;df++)
                    {
                        try
                        {
                       if(bn[df]=='a')
                       {
                         bn[df+s]='e'; 
                      //   System.out.println(df+s);
                       }
                       else if(bn[df]=='e')
                       {
                           bn[df+s]='i';
                       }
                       else if(bn[df]=='o')
                               {
                                  bn[df+s]='u'; 
                               }
                       else if(bn[df]=='u')
                       {
                         bn[df+s]='a';
                       }
                       else if(bn[df]=='i')
                       {
                          bn[df+s]='o'; 
                       }
                       else
                       {
                          bn[df]='g';  
                       }
                        }
                        catch(Exception jy)
                        {
                            
                        }
                        uy++;   
                    }
                    
                    
                    
                    String cf=String.copyValueOf(bn);
                    
                    System.out.println(cf);
                    
                    for(int sw=0;sw<t;sw++)
                    {
                        if((sw+1)%s==0&&sw!=0)
                        {
                            System.out.print(bn[sw]);
                            System.out.println();
                        }
                        else
                            System.out.print(bn[sw]);
                    }
                //    System.out.println(bn[5]);
                    
                    
                    
                    
                    break;
                }
                else
                {
                    int sr=t/s;
                  
                    if(sr<5)
                    {
                        z=1;
                        break;
                    }
                }
               // s++;
            }
            if(z==1)
            {
                System.out.println(-1);
            }
        }
    }
    
}
