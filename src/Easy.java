import java.util.*;

public class Easy {
    Util util = new Util();

    public int reverse(int x) {

        int isNegative = x < 0 ? -1 : 1;
        x *= isNegative;
        double output = 0;
        while (x > 0) {
            int dividend = x / 10;
            int remainder = x % 10;
            output = output * 10 + remainder;
            x = dividend;
        }
        output = output * isNegative;

        return output > Integer.MAX_VALUE || output < Integer.MIN_VALUE ? 0 : (int) output;
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        char[] numArr = (x + "").toCharArray();
        int right = numArr.length - 1;
        for (int i = 0; i <= right; i++, right--) {
            if (numArr[i] != numArr[numArr.length - i - 1]) return false;
        }
        return true;
    }

    public int romanToInt(String s) {

        int prev = 0;
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentVal = romanCharToInt(s.charAt(i));
            if (currentVal < prev) sum -= currentVal;
            else sum += currentVal;
            prev = currentVal;

        }
        return sum;
    }

    public int romanCharToInt(char c) {
        int output = 0;
        switch (c) {
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

    public String longestCommonPrefix(String[] strs) {
        String output = "";
        String item = "";
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < item.length()) item = strs[i];
        }
        for (int i = 0; i < item.length(); i++) {
            String subStr = item.substring(0, item.length() - i);
            System.out.println("subStr: " + subStr);

            boolean flag = false;
            for (int j = 0; j < strs.length; j++) {
                System.out.println(subStr);

                if (strs[j].startsWith(subStr) == false) {
                    flag = false;
                    break;
                }
                flag = true;
            }
            if (flag == true && subStr.length() > output.length()) output = subStr;
        }
        return output;
    }

    public boolean isValidParanthesis(String s) {

        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            String temp = stack.size() > 0 ? stack.peek() : "";
            System.out.println("c: " + c + " temp: " + temp);
            if (c.equals("(") || c.equals("{") || c.equals("[")) {
                stack.push(c);
                System.out.println("pushed: " + c);
            } else if (c.equals(")") && temp.equals("(") || c.equals("}") && temp.equals("{") || c.equals("]") && temp.equals("[")) {
                System.out.println("poped: " + stack.pop());
            } else return false;
        }

        return stack.size() > 0 ? false : true;
    }

    public ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) return null;
        ListNode Head = new ListNode();
        ListNode output = Head;

        while (l1 != null || l2 != null) {
            int num1 = l1 != null ? l1.val : -9999;
            int num2 = l2 != null ? l2.val : -9999;

            if (num1 != -9999 && num2 != -9999) {
                if (num1 < num2) {
                    output.val = num1;
                    l1 = l1.next;
                } else {
                    output.val = num2;
                    l2 = l2.next;
                }
            } else {
                if (num1 != -9999) {
                    output.val = num1;
                    l1 = l1.next;
                }
                if (num2 != -9999) {
                    output.val = num2;
                    l2 = l2.next;
                }
            }

            if (l1 != null || l2 != null) {
                output.next = new ListNode();
                output = output.next;
            }
        }
        return Head;
    }

    public int removeDuplicatesFromSortedArray(int[] nums) {

        if (nums == null || nums.length == 0) return 0;

        int prev = nums[0];
        int currentIdx = 1;
        for (int i = 1; i < nums.length; i++) {
            System.out.println();
            if (prev != nums[i]) {
                nums[currentIdx] = nums[i];
                prev = nums[i];
                currentIdx++;
            }
        }
        return currentIdx;

    }

    public int removeElement(int[] nums, int val) {

        if (nums == null || nums.length == 0) return 0;
        int currentIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("current val: " + nums[i]);

            if (nums[i] != val) {
                nums[currentIdx] = nums[i];
                currentIdx++;
            }
        }
        util.printArray(nums);

        return currentIdx;
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (haystack.length() == 0) return -1;

        return haystack.indexOf(needle);

    }

    public int searchInsert(int[] nums, int target) {

        int output = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                output = i;
            } else if (nums[i] > target && output == -1) {
                output = i > 0 ? i : 0;
            }
        }
        if (output == -1) output = nums.length;
        return output;
    }

    public String countAndSay(int n) {

        if (n == 0) return "";
        String output = "1";

        for (int i = 2; i <= n; i++) {
            String result = "";
            int counter = 1;
            char prev = output.charAt(0);
            for (int j = 1; j < output.length(); j++) {
                char c = output.charAt(j);
                if (c == prev) {
                    counter++;
                } else {
                    System.out.println("1. char : " + prev + " counter : " + counter);
                    result += counter + String.valueOf(prev);
                    System.out.println("1.result: " + result);
                    counter = 1;
                }
                prev = c;
            }
            System.out.println("2. char : " + prev + " counter : " + counter);
            result += counter + String.valueOf(prev);
            output = result;
        }
        return output;
    }

    public int[][] flipAndInvertImage(int[][] A) {

        for (int i = 0; i < A.length; i++) {
            int rowLength = A[i].length;
            for (int j = 0; j < rowLength / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][rowLength - 1 - j] == 0 ? 1 : 0;
                A[i][rowLength - 1 - j] = temp == 0 ? 1 : 0;
            }
            if (rowLength % 2 == 1) {
                A[i][rowLength / 2] = A[i][rowLength / 2] == 0 ? 1 : 0;
            }
        }
        return A;
    }
    public int maxSubArray(int[] nums) {
        int output = nums[0];
        for(int i=1; i< nums.length; i++){
            if(nums[i-1]+nums[i]>nums[i])
                nums[i] = nums[i-1]+nums[i];
            if(nums[i]>output)
                output = nums[i];
        }
        return output;
    }
    public int[] plusOne(int[] digits) {
        for (int i=digits.length-1; i>=0; i--){
            digits[i]++;
            if(digits[i]<=9)
                return digits;

            digits[i] = 0;
            System.out.println("current : "+digits[i]);
        }
        int [] output = new int[digits.length+1];
        output[0]=1;

        return output;
    }
}




