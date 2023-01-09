class Solution {
public:
bool isNeg(int x){
    //if(x<0) return 1;
    //else return 0;
    return x<0?1:0;
}
    int reverse(int x) {
        //-123
        bool res=false;
        if(isNeg(x)!=0){
            res=true;
        }
        x=abs(x);
        
        int ans=0;
        int temp;
        while(x>0)  
        {
            temp=x%10; //
            if((double)INT_MAX/ans<=10.0) //when my ans will exceed then we will use this line
                return 0;
            ans*=10;
            ans+=temp;
            x/=10;
        }
        //cout<<neg<<endl;
        //if(res==false) return ans;
        //else return ans*-1;
        return res==false?ans:ans*-1; //( condition)? If( part): else(part);
          
    }
};
