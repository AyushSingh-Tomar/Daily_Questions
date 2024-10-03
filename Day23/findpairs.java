#include <bits/stdc++.h> 
using namespace std; 
int binary_search_min(vector<long long>v, long long prevVal, long long mn) 
{ int l = 0, r = v.size() - 1; while(l <= r) { int md = (l + r) / 2; if (v[md] + prevVal > mn) r = md - 1; else l = md + 1; } return l; } int binary_search_max(vector<long long>v, long long prevVal, long long mx) { int l = 0, r = v.size() - 1; while(l <= r) { int md = (l + r) / 2; if (v[md] + prevVal > mx) r = md - 1; else l = md + 1; } return r; } int main() { int n; cin>>n; long long l, r; cin>>l>>r; vector<long long>v(n), v2, v3; for (int i = 0; i < n; i++) { cin>>v[i]; if (v[i] % 2) v2.push_back(v[i]); else v3.push_back(v[i]); } sort(v2.begin(), v2.end()); sort(v3.begin(), v3.end()); int nb = 0; for (int i = 0; i < v2.size(); i++) { int r1 = binary_search_max(v3, v2[i], r); int l1 = binary_search_min(v3, v2[i], l); if (r1 < 0 || l1 > v3.size()) continue; nb += (r1 - l1 + 1); } cout<<nb; }

