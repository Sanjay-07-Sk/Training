class Solution2525 {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol=(long)length*width*height;
        boolean bulky=false;
        boolean heavy=false;
        if(length>=10000 || width>=10000 || height>=10000 || vol>=1000000000)bulky=true;
        if(mass>=100)heavy=true;
        if(bulky==true && heavy==true)return "Both";
        else if(bulky)return "Bulky";
        else if(heavy)return "Heavy";
        else return "Neither";
    }
}