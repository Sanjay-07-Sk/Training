class Solution1401 {
    public boolean isRobotBounded(String instructions) {
        int d=0;
        int[] loc=new int[]{0,0};
        for(int i=0;i<instructions.length();i++){
            char ch=instructions.charAt(i);
            if(ch=='L')d=(d+1)%4;
            else if(ch=='R')d=(d+3)%4;
            else{
                if(d==0)loc[1]++;
                else if(d==1)loc[0]--;
                else if(d==2)loc[1]--;
                else loc[0]++;
            }
        }
        if(loc[0]==0 && loc[1]==0 || d!=0)return true;
        return false;
    }
}