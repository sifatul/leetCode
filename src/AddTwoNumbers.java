public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*
         * 1. Generate numbers from two ListNode in reverse order
         * 2. Sum the numbers
         * 3. return as ListNode
         * */

        int number1 = 0;
        int iterator = 1;
        while (l1 != null) {
            number1 = l1.val * iterator + number1;
            iterator *= 10;
            l1 = l1.next;
        }

        //generate number from l2

        int number2 = 0;
        iterator = 1;
        while (l2 != null) {
            number2 += l2.val * iterator;
            iterator *= 10;
            l2 = l2.next;
        }
        System.out.println("number1 : " + number1 + " number2: " + number2);

        int sum = number1 + number2;
        System.out.println("sum: " + sum);

        /* return the sum as listNode but in reverse order */

        if (sum == 0) return new ListNode(sum);

        int divisor = sum / 10;
        int remainder = sum % 10;
        ListNode Head = new ListNode(remainder);
//        System.out.println("output: " + remainder);
        ListNode output = Head;
        sum = divisor;
        while (sum != 0) {
            divisor = sum / 10;
            remainder = sum % 10;
            output.next = new ListNode(remainder);
            output =  output.next;
            sum = divisor;
//            System.out.println("output: " + remainder);

        }
        return Head;
    }

    public ListNode leetCodeSolution(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

}
