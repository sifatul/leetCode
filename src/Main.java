import org.w3c.dom.NodeList;

import java.util.List;

public class Main {
    public static void main(String []args){
        System.out.println("hello world");
        //starting AddTwoNumbers


//        ListNode listNode = new ListNode();
//        ListNode l1 = listNode.arrToListNode(new int[]{9});
//        ListNode l2 = listNode.arrToListNode(new int[]{1,9,9,9,9,9,9,9,9,9});
//

        Easy easy = new Easy();
        String output = easy.countAndSay( 6);
//        int output = easy.searchInsert("aaaaa","bb");
//        listNode.print(output);
        System.out.println(output);
    }
}
