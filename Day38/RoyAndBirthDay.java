/*#include<bits/stdc++.h>
using namespace std;
#define pb push_back
#define mp make_pair
#define clr(x) x.clear()
#define sz(x) ((int)(x).size())
#define F first
#define S second
#define REP(i,a,b) for(i=a;i<b;i++)
#define rep(i,b) for(i=0;i<b;i++)
#define rep1(i,b) for(i=1;i<=b;i++)
#define pdn(n) printf("%d\n",n)
#define sl(n) scanf("%lld",&n)
#define sd(n) scanf("%d",&n)
#define pn printf("\n")
typedef pair<int,int> PII;
typedef vector<PII> VPII;
typedef vector<int> VI;
typedef vector<VI> VVI;
typedef long long LL;
#define MOD 1000000007
LL mpow(LL a, LL n) 
{LL ret=1;LL b=a;while(n) {if(n&1) 
ret=(ret*b)%MOD;b=(b*b)%MOD;n>>=1;}
return (LL)ret;}
#define MAXN 1000100
#define assn(n,a,b) assert(n<=b && n>=a)
LL fac[MAXN+10]={},inv[MAXN+10]={};
void precalc()
{
 LL i;
 fac[0]=1;
 inv[0]=1;
 fac[1]=1;
 inv[1]=1;
 for(i=2; i<MAXN; i++)
 {
 fac[i]=(i*fac[i-1])%MOD;
 inv[i]=mpow(fac[i],MOD-2);
 }
}
LL choose(LL n, LL r)
{
 if(n<=0 || r<0 || n<r)return 0ll;
 LL p=((fac[n]*(inv[r]))%MOD*(inv[n-r]))%MOD;
 return p;
}
int main()
{
 precalc();
 int t,cnt=0;
 cin >> t;
 assn(t,1,100);
 while(t--)
 {
 string s;
 LL i,j,n,a=0,b=0,ar[5]={},arr[26]={},ss=0,sss=0;
 cin >> s;
 n=s.length();
 cnt+=n;
 assn(n,1,1000000);
 for(i=0; i<n; i++)
 {
 if(s[i]=='a')ar[0]++;
 else if(s[i]=='e')ar[1]++;
 else if(s[i]=='i')ar[2]++;
 else if(s[i]=='o')ar[3]++;
 else if(s[i]=='u')ar[4]++;
 else{arr[s[i]-'a']++;ss++;}
 }
 sss=ar[0]+ar[1]+ar[2]+ar[3]+ar[4];
 LL p=choose(ss+1,sss);
 if(ss+1<sss)
 {
 cout << -1 << endl;
 continue;
 }
 LL q=fac[sss];
 for(i=0; i<5; i++)
 q=(q*inv[ar[i]])%MOD;
 q=(q*fac[ss])%MOD;
 for(i=0; i<26; i++)
 q=(q*inv[arr[i]])%MOD;
 p=(p*q)%MOD;
 cout << p << endl;
 }
 assn(cnt,1,1000000);
 return 0;
} */
