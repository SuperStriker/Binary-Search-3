TC: O(logn)
SC: O(1)


Runtime: 32 ms, faster than 83.91% of Python3 online submissions for Pow(x, n).
Memory Usage: 12.6 MB, less than 100.00% of Python3 online submissions for Pow(x, n).




class Solution:
    def myPow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """
        if n==0:
            return 1
        elif n<0:
            n=-n
            return 1/(x*self.myPow(x,n-1))
        else:
            return self.myPow(x*x,n/2) if n%2==0 else x*self.myPow(x,n-1)  
