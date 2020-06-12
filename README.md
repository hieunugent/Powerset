# Powerset
- write a function take an unique and return its powerset
# soluton
- start the result with an empty array set
- the length of the result will be the next length of powerset
  - start at empty set the power set will have length 1
  - element in the array will be iterate all
  - len of the current powerset need to add is 1
  - all the subset is not repeat but it inheritate some value from previous 
  - ex [] , -> [1] , [2], [3]
       [1] -> [1,2] , [1, 3]
  - for array [1, 2, 3] as fisrt interate add 1 in to current set [[],[1]]
  - the current length is 2, next element is 2, add new element through iterate small loop until index i = length [2], [1, 2] 
  - current set [[],[1], [2], [1,2]]
  - the current length now is 4 , next element is 3,add new element through iterate small loop until index i < 4 [3], [1,3] , [2,3], [1,2,3]
  - current set [[], [1], [2], [1,2], [3], [1,3], [2,3], [1,2,3]]
  - no more element to push
  - return result
- time complexity outer loop cost O(n), inner loop cost 2n , because as each time the small loop will iterate twice amount 
- result O(n^2n)
 
  
