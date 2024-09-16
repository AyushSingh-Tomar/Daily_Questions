package Day1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        int ar[] = new int[T];
        for(int i = 0; i < T; i++) {
            ar[i] = Integer.parseInt(br.readLine()); 
        }
        
        for(int k = 0; k < T; k++) {
            int n = ar[k];
            
            if(n < 2) {
                System.out.println(0);
                continue;
            }
            
            if(n == 2) {
                System.out.println(1); 
                continue;
            }
            
            int count = 1;
            int limit = (n - 1) / 2;

            boolean[] isPrime = new boolean[limit + 1];
            Arrays.fill(isPrime, true); 
            

            for (int i = 1; i * i <= limit; i++) {
                if (isPrime[i]) {
                    int prime = 2 * i + 1;
                    for (int j = i * (prime + 1); j <= limit; j += prime) {
                        isPrime[j] = false;
                    }
                }
            }
            
            for (int i = 1; i <= limit; i++) {
                if (isPrime[i]) count++;
            }
            
            System.out.println(count);
        }
    }
}

