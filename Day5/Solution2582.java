class Solution2582 {
    public int passThePillow(int n, int time) {
        int end=0;
        int p=1;
        for(int i=1;i<=time;i++){
            if(end==0)p++;
            else p--;
            if(p==n)end=1;
            if(p==1)end=0;
        }
        return p;
    }
}