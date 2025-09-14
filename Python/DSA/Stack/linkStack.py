class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.head = None
        self.length = 0

    def push(self, val):
        new_node = Node(val)
        if self.head is None:
            self.head = new_node
            self.length += 1

        self.head.next = new_node
        self.length += 1

    def isEmpty(self):
        return self.length == 0

    def pop(self):
        if self.isEmpty():
            return "The stack is empty."

        temp = self.head()
        self.rear =