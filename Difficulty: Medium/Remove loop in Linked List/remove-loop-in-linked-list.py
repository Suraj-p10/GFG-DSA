'''
# node class:

class Node:
    def __init__(self,val):
        self.next=None
        self.data=val

'''

class Solution:
    def removeLoop(self, head):
        # Detect loop using Floyd's algorithm
        slow, fast = head, head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:  # Loop detected
                self.removeCycle(head, slow)
                return

    def removeCycle(self, head, meeting_point):
        # Move one pointer to the head
        start = head
        
        # If loop starts at head itself
        if start == meeting_point:
            while meeting_point.next != start:
                meeting_point = meeting_point.next
            meeting_point.next = None  # Break the loop
            return
        
        # Move both pointers one step at a time until they meet
        prev = None
        while start != meeting_point:
            prev = meeting_point
            start = start.next
            meeting_point = meeting_point.next
        
        # Break the loop
        prev.next = None


#{ 
 # Driver Code Starts
# driver code:


class Node:

    def __init__(self, val):
        self.next = None
        self.data = val


class linkedList:

    def __init__(self):
        self.head = None
        self.tail = None

    def add(self, num):
        if self.head is None:
            self.head = Node(num)
            self.tail = self.head
        else:
            self.tail.next = Node(num)
            self.tail = self.tail.next

    def isLoop(self):
        if self.head is None:
            return False

        fast = self.head.next
        slow = self.head

        while slow != fast:
            if fast is None or fast.next is None:
                return False
            fast = fast.next.next
            slow = slow.next

        return True

    def loopHere(self, position):
        if position == 0:
            return

        walk = self.head
        for _ in range(1, position):
            walk = walk.next
        self.tail.next = walk

    def length(self):
        walk = self.head
        ret = 0
        while walk:
            ret += 1
            walk = walk.next
        return ret


if __name__ == "__main__":
    t = int(input())
    for _ in range(t):

        arr = tuple(int(x) for x in input().split())
        pos = int(input())
        n = len(arr)
        ll = linkedList()
        for i in arr:
            ll.add(i)
        ll.loopHere(pos)

        Solution().removeLoop(ll.head)

        if ll.isLoop() or ll.length() != n:
            print("false")
            continue
        else:
            print("true")
        print("~")

# } Driver Code Ends