class Solution {
public:
    int fib(int n) {
        long long mod=1000000007;
        if(n<=1) return n;
    int prev1=1,prev2=0;
    int curr;
    for(int i=2;i<=n;i++){
        curr=(prev1+prev2)%mod;
        prev2=prev1%mod;
        prev1=curr%mod;
    }
    return curr%mod;
    }
};
//tc=O(n)  sc=O(1)
