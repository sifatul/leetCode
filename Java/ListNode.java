public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public void print(ListNode list){

        while(list != null){
            System.out.print(list.val+"-> ");
            list = list.next;

        };
        System.out.println();
        return ;
    }
    public ListNode populateList(int [] arr){
        if(arr == null || arr.length ==0) return null;

        ListNode Head = new ListNode();
        ListNode newList = Head;

        for(int i=0; i<arr.length; i++){
            newList.val = arr[i];
            if(i<arr.length-1){
                newList.next = new ListNode();
                newList = newList.next;
            }

        }
        return Head;
    }
    public ListNode arrToListNode(int [] arr){
        //lets populate the sample ListNode 1

        ListNode Object= new ListNode();
        ListNode l1= Object.populateList(arr);
        System.out.println("populated new NodeList");
        Object.print(l1);

        return l1;
    }
}

