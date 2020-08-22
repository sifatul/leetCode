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
//        AddTwoNumbers addTwo = new AddTwoNumbers();
//        ListNode output = addTwo.addTwoNumbers(l1, l2);
//        listNode.print(output);


        Easy easy = new Easy();
        Boolean output = easy.isValidParanthesis(  "{[]}");
        System.out.println(output);
    }
}
