public class Task3 {
    public static void Mountain(int[] nums) {
        int peak = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int l = i - 1;
            int r = i + 1;
            int lcount = 0, rcount = 0;
            while (l >= 0 && nums[l] < nums[l+1]) {
                l--;
                lcount++;
            }
            while (r < nums.length() && nums[r] < nums[r-1]) {
                rcount++;
                r++;
            }
            int sum = Math.min(lcount, rcount) * 2 + 1;
            if (max < sum) {
                mux = sum;
                peak = i;
            }
        }
        int[] ans = new int[max];
        int index = 0;
        for (int i = peak - max / 2; i < peak + max / 2; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        Mountain(new int[] {
            2,
            1,
            4,
            7,
            3,
            2,
            5
        });
    }
}
