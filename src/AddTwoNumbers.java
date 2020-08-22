import java.util.List;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*
         * 1. Iterate the two ListNode
         * 2. Sum the numbers
         * 3. return as ListNode
         * */

        ListNode Head = new ListNode();
        ListNode output = Head;
        int carry = 0;

        while(l1!=null || l2!=null){
            int num1 =0;
            int num2 =0;
            if(l1 != null) {
                num1 = l1.val;
                l1= l1.next;
            }
            if(l2 != null) {
                num2 = l2.val;
                l2= l2.next;
            }
            int sum = num1 + num2+carry;

            output.val = sum % 10;
            carry = sum / 10;

            if(l1 !=null || l2!=null){
                output.next = new ListNode(carry);
                output = output.next;
            }
        }
        if(carry>0){
            output.next=new ListNode(carry);
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
