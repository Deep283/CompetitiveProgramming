class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> mp;
        for(int i=0;i<nums.size();i++){
            int ff=target - nums[i];
            if(mp.find(ff) != mp.end()){
                return {mp[ff],i};
            }else{
                mp[nums[i]]=i;
            }
        }
        return {};
    }
};
