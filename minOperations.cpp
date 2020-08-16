class Solution {
public:
    int minOperations(int n) {
        int mo = 0;
        for(int i=1; i<=n; i+=2){
            mo += n - i;
        }
        return mo;
    }
};
