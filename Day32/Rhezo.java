// #include<bits/stdc++.h>

// // #include <ext/pb_ds/assoc_container.hpp>

// // #include <ext/pb_ds/tree_policy.hpp>

// // using namespace __gnu_pbds;

// using namespace std;

// // typedef tree<pair<int,int>, null_type, less<pair<int,int>>, rb_tree_tag, tree_order_statistics_node_update> ordered_set;

// #define ll long long

// #define scn(n) scanf("%d",&n)

// #define lscn(n) scanf("%lld",&n)

// #define lpri(n) printf("%lld",n)

// #define pri(n) printf("%d",n)

// #define pln() printf("\n")

// #define priln(n) printf("%d\n",n)

// #define lpriln(n) printf("%lld\n",n)

// #define rep(i,init,n) for(int i=init;i<n;i++)

// #define pb push_back

// #define mp make_pair

// #define F first

// #define S second

// #define gcd __gcd

// #define inf INT_MAX

// #define ninf INT_MIN

// #define inf INT_MAX

// #define linf LLONG_MAX

// #define lninf LLONG_MIN

// const int mod = 1e9 + 7;

// const int N = 1e6 + 4;

 

// // solution  begins from here

// ll ex(ll x,ll n)

// {

// ll res=1;

// while(n>0)

// {

// if(n%2==1)

// res=(res*x)%mod;


 

// x=(x*x)%mod;


 

// n=n/2;

// }

// return res%mod;

// }

// int main()

// {

// ios_base::sync_with_stdio(false);

// cin.tie(NULL); cout.tie(NULL);


 

// ll a;

// string b;

// cin>>a>>b;


 

// ll x=b.length();


 

// ll val=0;


 

// rep(i,0,x)

// {

// val=(val*10 +b[i]-'0')%(mod-1);

// }

 

// cout<<ex(a,val)%mod<<endl;

 

// }