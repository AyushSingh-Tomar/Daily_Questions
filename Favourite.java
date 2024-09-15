import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[]) throws Exception {
        HashMap<String,Integer> map= new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n==1){
            System.out.println(1);
            return;
        }
        String s=br.readLine();
        String str[]=s.split(" ");
        int max=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            map.put(str[i],map.getOrDefault(str[i],0)+1);
            if(max<map.get(str[i]))
            {
                max=map.get(str[i]);
                ans=1;
            }
            else if(max==map.get(str[i]))
            {
                ans++;
            }
        }

        System.out.println(ans);
    }

}

