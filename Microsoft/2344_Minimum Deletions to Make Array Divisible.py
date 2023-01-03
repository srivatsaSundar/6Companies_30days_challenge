#Question no: 2344

#Question Name: Minimum Deletions to Make Array Divisible

import math
class Solution:
    def minOperations(self, nums: List[int], numsDivide: List[int]) -> int:
        gcd=math.gcd(*numsDivide)
        count=0
        nums.sort()
        for i in nums:
            if(gcd%i):
              count+=1
            else:
                return count
        return -1
