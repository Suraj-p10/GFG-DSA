
class Solution:
    def decodedString(self, s):

        num = ''
        nums = []
        stack = ['']

        for item in s:

            if item.isdigit():
                num += item

            elif item == '[':
                nums.append(int(num))
                num = ''
                stack.append('')

            elif item == ']':
                substring = stack.pop()*nums.pop()
                stack[-1] += substring

            else:
                stack[-1] += item

        return stack[0]

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        s = input()

        ob = Solution()
        print(ob.decodedString(s))
        print("~")

# } Driver Code Ends