class Solution42 {
    public int trap(int[] height) {
        int[] leftmax=new int[height.length];
        int[] rightmax=new int[height.length];
        int max=-1;
        for(int i=0;i<height.length;i++){
            max=Math.max(max,height[i]);
            leftmax[i]=max;
        }
        max=-1;
        for(int i=height.length-1;i>=0;i--){
            max=Math.max(max,height[i]);
            rightmax[i]=max;
        }
        int water=0;
        for(int i=0;i<height.length;i++){
            water+=Math.min(leftmax[i],rightmax[i])-height[i];
        }
        return water;
    }
}