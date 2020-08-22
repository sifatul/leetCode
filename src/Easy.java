public class Easy {
    public int reverse(int x) {

        int isNegative = x<0?-1:1;
        x *= isNegative;
        double output =0;
        while(x>0){
            int dividend = x/10;
            int remainder = x%10;
            output = output*10+remainder;
            x= dividend;
        }
        output = output*isNegative;

        return output > Integer.MAX_VALUE || output<Integer.MIN_VALUE ? 0 : (int)output;
    }
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        char[] numArr = (x+"").toCharArray();
        int right = numArr.length-1;
        for(int i=0; i<= right;i++, right--){
            if(numArr[i] != numArr[numArr.length-i-1]) return false;
        }
        return true;
    }
    public int romanToInt(String s) {

        int prev = 0;
        int sum = 0;
        for (int i= s.length()-1; i>=0; i--){
            int currentVal = romanCharToInt(s.charAt(i));
            if(currentVal<prev) sum -=currentVal;
            else sum +=currentVal;
            prev = currentVal;

        }
        return sum;
    }
    public int romanCharToInt(char c){
        int output = 0;
        switch (c){
            case 'I':
                output = 1;
                break;
            case 'V':
                output = 5;
                break;
            case 'X':
                output = 10;
                break;
            case 'L':
                output = 50;
                break;
            case 'C':
                output = 100;
                break;
            case 'D':
                output = 500;
                break;
             case 'M':
                output = 1000;
                break;

        }
        return output;
    }
}
