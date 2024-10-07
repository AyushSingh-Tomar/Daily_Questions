import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);

        long xorA = 0, xorB = 0;

        // Calculate XOR from 0 to a-1
        switch ((int) ((a - 1) % 4)) {
            case 0: xorA = a - 1; break;
            case 1: xorA = 1; break;
            case 2: xorA = a; break;
            case 3: xorA = 0; break;
        }

        // Calculate XOR from 0 to b
        switch ((int) (b % 4)) {
            case 0: xorB = b; break;
            case 1: xorB = 1; break;
            case 2: xorB = b + 1; break;
            case 3: xorB = 0; break;
        }

        // XOR result for the range [a, b]
        long xorResult = xorA ^ xorB;

        if (xorResult % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
