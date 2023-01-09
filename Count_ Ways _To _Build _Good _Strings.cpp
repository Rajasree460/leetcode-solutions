#define ll long long

class Solution {
public:
    int countGoodStrings(int low, int high, int zero, int one) {
        vector<ll> res1(200005);
        set<int>st ;
        for(int i =0; i< 10 ;i++){
            st.insert(i);
        }
        ll mod = 1e9+7;
        res1[0] = 1;
        for(int i = 0; i < 100005; i++){
            res1[i + zero] %= mod;
            res1[i + zero] += res1[i];
            res1[i + one] %= mod;
           res1[i + one] += res1[i];
        }
        ll sm1 = 0;
        for(int i = low; i <= high; i++){
            sm1 = (sm1 + res1[i])%mod;
        }
        return sm1;
    }
};
