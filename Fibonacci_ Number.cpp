class Solution {
public:
    int fib(int n) {
        if(n==1||n==0) return n;
        else return(fib(n-1)+fib(n-2));
    }
};
//tc=O(2^n)
