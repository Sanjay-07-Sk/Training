class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gsum=0,csum=0;
        int tank=0;
        int st=0;
        for(int i=0;i<gas.length;i++){
            gsum+=gas[i];
            csum+=cost[i];
            tank+=gas[i]-cost[i];
            if(tank<0){
                tank=0;
                st=i+1;
            }
        }
        if(gsum>=csum)return st;
        return -1;
    }
}