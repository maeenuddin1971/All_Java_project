package codeforces_diverse_garland;
import java.util.*;
public class Codeforces_Diverse_Garland {
    public static void main(String[] args) {
       Scanner r=new Scanner(System.in);
       
        int y=r.nextInt();
        
       // char[] p=new char[y];
        
        String msn=r.next();
        int k=0;
        
         String bn=msn.substring(0, y);
         char[] p=bn.toCharArray();
         char[] hg=bn.toCharArray();
         for(int u=0;u<y;u++)
         {
             try
             {
            if(p[u]==p[u+1])
            {
                if(p[u+1]=='R')
                {
                    try
                    {
                        if(p[u+2]=='R')
                        {
                            p[u+1]='G';
                            k++;
                        }
                        else if(p[u+2]=='G')
                        {
                            p[u+1]='B';
                            k++;
                        }
                        else if(p[u+2]=='B')
                        {
                            p[u+1]='G';
                            k++;
                        }
                       
                        
                    }
                    catch(Exception gh)
                    {
                        if(p[u]==p[u+1])
                         {
                           if(p[u]=='G')
                           {
                               p[u+1]='R';
                               k++;
                           }
                           else if(p[u]=='R')
                           {
                               p[u+1]='G';
                               k++;
                           }
                           else if(p[u]=='B')
                           {
                               p[u+1]='G';
                               k++;
                           }
                         } 
                    }
                }
                else if(p[u+1]=='G')
                {
                    try
                    {
                       
                        if(p[u+2]=='G')
                        {
                            p[u+1]='B';
                            k++;
                        }
                        else if(p[u+2]=='B')
                        {
                            p[u+1]='R';
                            k++;
                        }
                        else if(p[u+2]=='R')
                        {
                            p[u+1]='B';
                            k++;
                        }
                        
                    }
                    catch(Exception gh)
                    {
                        if(p[u]==p[u+1])
                         {
                           if(p[u]=='G')
                           {
                               p[u+1]='R';
                               k++;
                           }
                           else if(p[u]=='R')
                           {
                               p[u+1]='G';
                               k++;
                           }
                           else if(p[u]=='B')
                           {
                               p[u+1]='G';
                               k++;
                           }
                         }
                    }
                }
                 else if(p[u+1]=='B')
                {
                    try
                    {
                       
                        if(p[u+2]=='G')
                        {
                            p[u+1]='R';
                            k++;
                        }
                        else if(p[u+2]=='B')
                        {
                            p[u+1]='G';
                            k++;
                        }
                        else if(p[u+2]=='R')
                        {
                            p[u+1]='G';
                            k++;
                        }
                        
                        
                        
                    }
                    catch(Exception gh)
                    {
                         if(p[u]==p[u+1])
                         {
                           if(p[u]=='G')
                           {
                               p[u+1]='R';
                               k++;
                           }
                           else if(p[u]=='R')
                           {
                               p[u+1]='G';
                               k++;
                           }
                           else if(p[u]=='B')
                           {
                               p[u+1]='G';
                               k++;
                           }
                         }
                    }
                }
                
                
                
                
                
                
                
                
                
                
                
            }
             }
             catch(Exception vf)
             {
                 
             }
         }
         
         System.out.println(k);
         System.out.println(p);
        
    }
    
}
