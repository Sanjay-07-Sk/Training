class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        int pairs=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    pairs++;
                }
            }
        }
        return pairs;
    }
}