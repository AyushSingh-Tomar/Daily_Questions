import java.util.*;

class TestClass {

public static void main(String args[] ) throws Exception {

Scanner s = new Scanner(System.in);

int t=s.nextInt();

while(t>0){

int n=s.nextInt();

long arr[]=new long[n];

for(int i=0;i<n;i++){

arr[i]=s.nextLong();

}

System.out.println(findgcd(arr));

t--;

}

}

static long findgcd(long arr[]){

long res=arr[0];

long lcm=arr[0];

for(int i=1;i<arr.length;i++){

res=gcd(lcm,arr[i]);

lcm=(lcm*arr[i])/res;

}

return lcm;

}

static long gcd(long a,long b){

if(b==0){

return a;

}

return gcd(b,a%b);

}

}