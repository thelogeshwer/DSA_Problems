class Solution {
#define ll long long
    /*
        'L' person visible to right persons
        'R' person visible only to left persons
        person at pos can see 'L' i<pos
        person at pos can see 'R' i>pos

    */

const static ll MOD= 1000000007;
        ll add(ll a , ll b, ll m = MOD){return ((a%m)+(b%m)+m)%m;}
        ll sub(ll a , ll b, ll m = MOD){return ((a%m)-(b%m)+m)%m;}
        ll mul(ll a , ll b, ll m = MOD){return ((a%m)*(b%m))%m;}
        ll modexp(ll a, ll e, ll m = MOD){
            a%=m; ll r = 1;
            while(e){
                if(e & 1) r = mul(r, a , m);
                a= mul(a,a,m);
                e>>=1;
            }
            return r;
        }

        ll inv(ll a, ll m = MOD) {return modexp(a, m-2, m);}

public:
    int countVisiblePeople(int n, int pos, int k) {
        ll ans = 2;
        for(int i=1; i<=k; i++){
            ans = mul(ans, (n-1)-(i-1));
            ans= mul(ans,inv(i));
        }
        return ans;    
    } 
};


// 2nd method very fast using backward way

#include <bits/stdc++.h>
using namespace std;
#define ll long long
const int M = 1e9 + 7, N = 1e5+2;
bool is_cal = false; //this global bool making all test run fast, everytime calling countVisiblePeople 

ll fact[N + 1], invfact[N + 1];

ll power(ll a, ll b) {
    // (a ^ b) % M
    ll res = 1;
    while (b) {
        if (b & 1)
            res = (res * a) % M;
        a = (a * a) % M;
        b >>= 1;
    }

    return res;
}

void cal_fact() {
    fact[0] = 1;
    for (int i = 1; i <= N; i++) {
        fact[i] = (i * fact[i - 1]) % M;
    }

    invfact[N-1] = power(fact[N - 1], M - 2); // Fermat inverse

    for (int i = N-2; i>=0 ; i--) {
        invfact[i] = (invfact[i + 1] * (i+1)) % M;
    }

    is_cal = true;
}

ll nCr(ll n, ll r) {
    if (r < 0 || r > n)
        return 0;
    return (fact[n] * invfact[r] % M * invfact[n - r] % M) % M;
}

ll find_ways(ll left, ll n, ll pos, ll k) {
    ll left_total = pos, right_total = n - pos - 1, right = k - left;

    if (left > left_total || right > right_total)
        return 0;

    ll poss_left = nCr(left_total, left);
    ll poss_right = nCr(right_total, right);

    return (poss_left * poss_right) % M;
}

class Solution {
public:
    int countVisiblePeople(int n, int pos, int k) {
        if (!is_cal)
            cal_fact();
        return (2LL * nCr(n - 1, k)) % M;
    }
};
