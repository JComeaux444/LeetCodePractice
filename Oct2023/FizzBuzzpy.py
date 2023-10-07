class Solution:
    def fizzBuzz(self, n: int) -> List[str]:

        # make a list to put answers into
        strList = []
        
        # while n is basically when n is not zero
        while n:
            # if n doesn't have a remainder for 3 and 5
            if n%3 == 0 and n%5 == 0:
                strList.append("FizzBuzz")
            # if n has a remainder after divided by just 3
            elif n%3 == 0:
                strList.append("Fizz")
            # if n has a remainder after divided by just 3
            elif n%5 == 0:
                strList.append("Buzz")
            # otherwise append to list
            else:
                strList.append(str(n)) 
            # de increment the int given
            n -= 1  
        # reverse the list since objects are appended to front of list
        return strList[::-1]