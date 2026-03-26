class Solution390 {
    public int lastRemaining(int n) {
        boolean left=true;
        int start=1;
        int step=1;
        int arr=n;
        while(arr>1){
            if(left || arr%2==1){
                start=start+step;
            }
            step*=2;
            arr/=2;
            left=!left;
        }
        return start;
    }
}