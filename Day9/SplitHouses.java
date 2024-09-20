import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine().replace('.', 'B');
        int flag = 1;
        if (s.length() > 1) {
            for (int i = 0; i < s.length(); i++) {
                if (i == 0 && s.charAt(i) == 'H' && s.charAt(i + 1) == 'H') {
                    flag = 0;
                    break;
                } else if (i == s.length() - 1 && s.charAt(i) == 'H' && s.charAt(i - 1) == 'H') {
                    flag = 0;
                    break;
                } else if ((i != 0) && (i != (s.length() - 1)) && s.charAt(i) == 'H' && (s.charAt(i - 1) == 'H' || s.charAt(i + 1) == 'H')) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(s);
            }
        }
        else{
            System.out.println("YES");
            System.out.println(s);
        }
    }
}
