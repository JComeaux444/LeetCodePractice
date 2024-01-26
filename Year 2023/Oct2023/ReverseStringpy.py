class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        # s[:] will edit the actual memory bytes s points to
        # s[::-1] will iterate through the list from the end
        
        #s[:] = s[::-1]
        


        # pointer approach

        # left and right pointers
        left = 0
        right = len(s)-1

        while left < right:
            s[left], s[right] = s[right], s[left]

            left += 1 
            right -= 1