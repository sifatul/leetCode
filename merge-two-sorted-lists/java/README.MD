# two-pointer

 
Time  | Space
----- | ------
O(m+n) | O(m+n)

Taking two pointers, one pointer on list1 and another on list2 iterate until one pointer becomes null. `while(list1 !=null && list2 != null) ` Then, add the smaller value to the output list.

any of the two list might be smaller than the other. so append the remaining of the larger list to the output. 

```
if(list1 !=null) prev.next = list1;
if(list2 !=null) prev.next = list2;
```

# recursion

 
Time  | Space
----- | ------
O(m+n) | O(m+n)


case 1: Think about a simple case where `list1=[]` and `list2=[1]`. We simple return the other list when one list is `null`.
case 2: element in list1 is smaller.example : `list1=[1,3]` and `list2=[2,4]` then head is `1` of `list1` just need to find next of `list1`. so `list1.next = mergeList(list1.next, list2);`
case 3: element in list2 is smaller.example : `list1=[6,3]` and `list2=[2,4]` then head is `2` of `list2` just need to find next of `list2`. so `list@.next = mergeList(list, list2.next);`
 

 
 