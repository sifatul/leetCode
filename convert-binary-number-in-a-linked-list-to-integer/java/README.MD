# reverse and convert

 
Time  | Space
----- | ------
O(n) | O(n)

To find the decimal of the binary first we need to get the binary numbers. So, iterate through all the nodes and get the binary numbers in an array.

```
  int counter = 0;
  int [] numbers = new int[30];
  while(head !=null){
      int val = head.val;
      numbers[counter] = val;
      counter ++;
      head = head.next;
  }
 
```
Now, as we have the binary numbers just need to generate decimal number from binary. Iterate in reverse order:
```
int output = 0;

for(int i=0; i<counter; i++){
    if(numbers[i]>0) output += Math.pow(2,counter-i-1);
}
return output;
```

 
 

# reverse and convert

 
Time  | Space
----- | ------
O(n) | O(1)


In this technique current node is always the last node. 
1. Lets assume current arr is `head = [1]`. So the `answer` would be `answer=head.val`.
2. Lets assume current arr is `head = [1,0]`. Now, our tail is the second element. Thus previous result must be multiplied by two. `answer = answer * 2` but what if the array is `head = [1,1]`. In that case we would also require to add the value of the tail `answer = answer * 2 + head.val`  
