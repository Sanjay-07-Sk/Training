class 3232 {
    public boolean canAliceWin(int[] nums) {
        int ssum=0;
        int dsum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9)ssum+=nums[i];
            else dsum+=nums[i];
        }
        if(ssum==dsum)return false;
        return true;
    }
}