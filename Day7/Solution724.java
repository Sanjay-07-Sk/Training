class Solution724 {
    public int pivotIndex(int[] nums) {
        int total=0;
        int left=0;
        for(int n:nums){
            total+=n;
        }
        for(int i=0;i<nums.length;i++){
            total-=nums[i];
            if(left==total)return i;
            else{
                left+=nums[i];
            }
        }
        return -1;
    }
}