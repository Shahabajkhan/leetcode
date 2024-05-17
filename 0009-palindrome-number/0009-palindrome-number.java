class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long res=0;
        long num=x;
        while(num != 0){
            int digit= (int) (num%10);
            res = res*10 + digit;
            num=num/10;
        }
        return res==x;
    }
}