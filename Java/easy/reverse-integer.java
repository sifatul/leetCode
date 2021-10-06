class Solution {
    public  int reverse(int x) {
      int output = 0;
      int copyX = x;
      if(x<0) copyX = x * -1;

      while(copyX>0){
        int rem = copyX%10;

        copyX = copyX/10;
        if (output > Integer.MAX_VALUE/10 || output < Integer.MIN_VALUE/10) {
          return 0;
        } 
        output = output * 10 +rem;
      }
      if(x<0) output *= -1; 

      return (int)output;
    }
}