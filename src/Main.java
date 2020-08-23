import org.w3c.dom.NodeList;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Util util = new Util();

//        ListNode listNode = new ListNode();
//        ListNode l1 = listNode.arrToListNode(new int[]{9});
//        ListNode l2 = listNode.arrToListNode(new int[]{1,9,9,9,9,9,9,9,9,9});
//


        Easy easy = new Easy();
        int[][] matrix = new int[][]{{1,0,0,1}, {0,1,1,1}};
        util.printMatrix(matrix);
        int[][] output = easy.flipAndInvertImage(matrix);
        System.out.println("output");
        util.printMatrix(output);

    }
}
