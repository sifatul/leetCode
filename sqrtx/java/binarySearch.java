class Solution {
    public int checkTarget(int target, long left, long right){
        if(left>right) return -1;
        long mid = left+(right-left)/2;
        if(mid*mid == target || mid==left || mid==right) return (int)mid;
        if(mid*mid > target) return checkTarget(target, left, mid);
        return checkTarget(target, mid, right);
        
    }
    public int mySqrt(int x) {
        if(x==0) return 0;
        return checkTarget(x, 1, x);
    }
}