package codeforces_b_personalized_cup;
import java.util.*;
public class Codeforces_B_Personalized_Cup {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        String man=r.nextLine();
        System.out.println(man.length());
        int len=man.length();
        
        int row=len/20;
        
        if(len%20==0)
        {    
        }
        else
        {
        row++;
        }
        
        
        
    int col=0;
  for(int i = 1; i <= 20; ++i)
    if(row * i >= len) {
      col = i;
      break;
    }
        
        
        
        
   //System.out.println(col);
  
  
    int ast = row * col - len;
    int ech = ast / row;
    int rem = ast % row;
    
   // System.out.println(ast+" "+ech+" "+rem);
    
    
    Vector<Integer> asts=new Vector();
  for(int i = 0, cur; i < row; ++i) {
    cur = ech;
    if(rem > 0)
      ++cur;
      --rem;
    asts.add(cur);
  }

  System.out.printf("%d %d\n", row, col);
  int cnt = 0;
  for(int i = 0; cnt < len && i < row; ++i) {
    //  System.out.println();
    for(int j = 0; cnt < len && j < col - asts.get(i); ++j) {
      System.out.printf("%c",man.charAt(cnt));
      ++cnt;
    }
    for(int j = 0; j < asts.get(i); ++j)
      System.out.printf("*");
    
    System.out.println();
  }
    
  
  
  
        
        
    }
    
}
