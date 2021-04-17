package codeforces_trailing_loves;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Codeforces_Trailing_Loves {
     static int N = (int)1e6;
    static InputReader in;
    static PrintWriter out;
        
    public static void main(String[] args) throws IOException{
        //InputStream ins = new FileInputStream("E:\\rush.txt");
        InputStream ins = System.in;
        in = new InputReader(ins);
        out = new PrintWriter(System.out);
        //code start from here
        new Task().solve(in, out);
        out.close();
    }
    
    static class Task{
        public void solve(InputReader in,PrintWriter out) {
            long n,m;
            n = in.nextLong();m = in.nextLong();
            ArrayList a = new ArrayList<>();
            ArrayList d = new ArrayList<>();
            for (long i = 2;i*i<=m;i++) {
                if (m%i==0) {
                    a.add(i);
                    int cnt1 = 0;
                    while (m%i==0) {
                        m/=i;
                        cnt1++;
                    }
                    d.add(cnt1);
                }
            }
            if (m>1) {
                a.add(m);
                d.add(1);
            }
            long ans = (long)1e18 + 100;
            for (int i = 0;i <(int)a.size();i++) {
                long ai = (long) a.get(i);
                int pi = (int) d.get(i);
                long nn = n;
                long res = 0;
                while (nn>0) {
                    res+=nn/ai;
                    nn/=ai;
                    System.out.println(res);
                }
                System.out.println(res);
                
                ans = Math.min(ans, res/pi);
               
            }
            out.println(ans);
        }
    }

    

    static class InputReader{
        public BufferedReader br;
        public StringTokenizer tokenizer;
        
        public InputReader(InputStream ins) {
            br = new BufferedReader(new InputStreamReader(ins));
            tokenizer = null;
        }
        
        public String next(){
            while (tokenizer==null || !tokenizer.hasMoreTokens()) {
                try {
                tokenizer = new StringTokenizer(br.readLine());
                }catch(IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        
        public long nextLong() {
            return Long.parseLong(next());
        }
        
        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
    
}
