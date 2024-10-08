import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T>0){
            String s= br.readLine();
            String[] str=s.split(" ");
            int N = Integer.parseInt(str[0]);
            int K = Integer.parseInt(str[1]);
            String st= br.readLine();
            String[] str1=st.split(" ");
            int[] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=Integer.parseInt(str1[i]);
            }
            int index = N-(K%N);
            for(int i=index;i<N;i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<index;i++){
                if(i==index-1){
                    System.out.print(arr[i]);
                }else{
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.printf("\n");
            T--;
        }
    }
}
