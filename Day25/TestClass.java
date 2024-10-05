import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            String[] custom_input_1 = br.readLine().split(" ");
            int N = Integer.parseInt(custom_input_1[0]);
            int K = Integer.parseInt(custom_input_1[1]);
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
            	A[i_A] = Integer.parseInt(arr_A[i_A]);
            }

            int[] out_ = solve(N, K, A);
            System.out.print(out_[0]);
            for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
            {
            	System.out.print(" " + out_[i_out_]);
            }
            
            System.out.println();
            
         }

         wr.close();
         br.close();
    }
    static int[] solve(int N, int K, int[] A)
   { // Write your code here 
    class Node{ int val, hd; Node(int val, int hd){ 
    this.val = val; 
    this.hd = hd; 
    } 
     } 
 List<Node> list = new ArrayList<>();
 for(int i = 0; i < A.length; i++){ 
 list.add(new Node(A[i], HammingDistance(A[i], K))); 
} 
Collections.sort(list, (a, b) -> { if(a.hd == b.hd) return a.val - b.val; return a.hd - b.hd; });
 int[] ans = new int[N]; for(int i = 0; i < N; i++){ ans[i] = list.get(i).val; } 
return ans; } 
static int HammingDistance(int a, int b){ 
int hd = 0; 
while(a > 0 || b > 0){ 
hd += (a & 1) ^ (b & 1); a >>= 1; b >>= 1; } 
return hd;
    
    }
}
