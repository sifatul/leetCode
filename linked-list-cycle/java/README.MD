# strategy

 
Time  | Space
----- | ------
O(n) | O(1)

If a list has cycle today or tomorrow rabbit and turtle will meet. So, loop until turtle or rabbit meets. 
 
Turtles are slower than rabbit. So rabbit will jump two nodes at a time `rabbit = rabbit.next.next1` while turtle will jump only one node `turtle = turtle.next;`. 


# HashTable

 
Time  | Space
----- | ------
O(n) | O(n)

Keep a record of the nodes visited in a set. `Set <ListNode> nodeVisited = new HashSet<>();` Iterate through all nodes and check if it already visited. `if(nodeVisited.contains(head)) return true;`