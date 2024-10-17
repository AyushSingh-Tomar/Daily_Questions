// import java.util.Scanner; 
// class TestClass {     
//     static final int MOD = 1000003; // 10^6 + 3     
//     public static void main(String args[]) {         
//         Scanner scanner = new Scanner(System.in);         
//         StringBuilder sb = new StringBuilder();                 // Read number of test cases         
//         int t = scanner.nextInt();         
//         scanner.nextLine(); // Consume newline after reading integer         // Precompute factorials mod 10^6 + 3         
//         long[] factorials = new long[MOD];         
//         factorials[0] = 1;         
//         for (int i = 1; i < MOD; i++) {             
//             factorials[i] = factorials[i-1] * i % MOD;         }         
//             for (int i = 0; i < t; i++) {             
//                 long n = scanner.nextLong();            
//                  long x = scanner.nextLong();             // Calculate factorial(N) % MOD             
//                  long factN;             
//                  if (n >= MOD) {                 
//                     factN = 0; // N! % MOD = 0 for N >= MOD because MOD is prime             
//                     } else {                 factN = factorials[(int) n];             }             
//                     // Calculate result for current test case             
//                     long answer = (factN * (x % MOD)) % MOD;             
//                     sb.append(answer).append('\n');         }         
//                     // Output all results         
//                     System.out.print(sb);         
//                     scanner.close();     } }
