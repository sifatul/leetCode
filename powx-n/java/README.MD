# Brute Force method

 
Time  | Space
----- | ------
O(n) | O(1)

 
Iterate x times and multiply it with itself for n times. 

# Recursion

 
Time  | Space
----- | ------
O(logN) | O(1)

 
divide the work into two halves. If n is odd, then x * (result received by computing two halves)

key hint: 
```
if (n % 2 == 0) {
    return fastPow(x, n / 2) * fastPow(x, n / 2);
} else {
    return fastPow(x, n / 2) * fastPow(x, n / 2) * x;
}
```

 
 