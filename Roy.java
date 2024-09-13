import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int L = Integer.parseInt(br.readLine());
       int N =  Integer.parseInt(br.readLine());
       int arr[][]=new int[N][2];
       for(int i=0;i<N;i++)
       {
        String num =br.readLine();
        String str[] =num.split(" ");
         arr[i][0]=Integer.parseInt(str[0]);
         arr[i][1]=Integer.parseInt(str[1]);
       }
       for(int i=0;i<N;i++)
       {
        int a =  arr[i][0];
        int b =  arr[i][1];
        if(a<L || b<L)
        {
            System.out.println("UPLOAD ANOTHER");
        }
        else if(a>=L && b>=L)
        {
            if(a==b)
            {
                System.out.println("ACCEPTED");
            }
            else
            {
                System.out.println("CROP IT");
            }
        }
       }

    }
}
