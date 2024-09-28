import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // long ans=1;
        // String n = br.readLine();
        // String s = br.readLine();
        // String str[]=s.split(" ");
        // for(String e:str)
        // {
        //     ans*=Integer.valueOf(e)%((long)(Math.pow(10,9)+7));
        // }
        // System.out.println(ans);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long ans = 1;
        long MOD = 1000000007; // Define the modulus value as an integer
        String n = br.readLine(); // Read the number of elements (not used in logic)
        String s = br.readLine(); // Read the space-separated integers
        String str[] = s.split(" "); // Split the string into an array of integers
        
        for (String e : str) {
            ans = (ans * (Integer.valueOf(e) % MOD)) % MOD; // Apply modulus in each step
        }
        
        System.out.println(ans); // Output the final answer
    }
}
