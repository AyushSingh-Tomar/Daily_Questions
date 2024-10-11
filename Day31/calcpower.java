// #include<bits/stdc++.h>

// using namespace std;

// typedef long long ll;

// #define mod 1000000007

// ll helper(ll a,ll b)

// {

//         if(b==0)

//         return 1;

//         if(a==0)

//         return 0;

//         ll ans;

//         if(b%2==0)

//         {

//                 ans=helper(a,b/2);

//                 return ((ans%mod)*(ans%mod))%mod;

//         }

//         else

//         {

//                 ans=a%mod;

//                 return ((ans%mod)*(helper(a,b-1)%mod))%mod;

                

//         }

// }

// int main()

// {

// ll a,b;

// cin>>a>>b;

// cout<<helper(a,b)<<endl;

// }
