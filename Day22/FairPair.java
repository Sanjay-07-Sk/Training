package Day22;
import java.util.Arrays;
public class FairPair {
   
    public static int countFairPairs(int[] nums,int lower,int upper){
        Arrays.sort(nums);
        int count=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum>=lower && sum<=upper){
                count++;
                left++;
            }else if(sum<lower){
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countFairPairs(new int[]{0,1,7,4,4,6}, 3, 6)); //Output: 6
    }
}
