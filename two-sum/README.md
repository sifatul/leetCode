# Nested Loop

 
Time  | Space
----- | ------
O(n^2) | O(n)


compare each item `arr[i]` with rest of the items in the arr `arr[j]` and check whether total value is achieved (`arr[i] + arr[j] == total`).

Example: 
```
arr = [2,7,11,15] 
target = 22
```

round 1: compare 2, with 7,11,15 and compare for total

round 2: compare 7, with 11,15 and check for total. While comparing `7+15` is `22` . So return [i,j];


# Store in a list

Time  | Space
----- | ------
O(n) | O(n)

iterate each item, check whether item exists in the store(list) 

> if item exists in the store(list) return index of the item in store and current index

> if item is not added in store then add the difference in store.

Example: 
```
arr = [2,7,11,15] 
target = 13
```

round 1: compare `2`, and check with store, which is empty (`[]`). So item does not exists in store, add the difference `13-2` (`[11]`)

round 2: compare `7`, and check with store (`[11]`). Item (`7`) does not exists in store, add the difference `13-7` (`[11, 6]`)

round 3: compare `11`, and check with store (`[11, 6]`). Item (`11`) *exists* in store; so return index of `11` in store and current item index (`2`)