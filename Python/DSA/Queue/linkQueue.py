class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Queue:
    def __init__(self):
        self.front = None
        self.rear = None
        self.length = 0

    def enqueue(self, val):
        new_node = Node(val)
        if self.rear is None:
            self.rear = self.front = new_node
            self.length += 1
            return
        self.rear.next = new_node
        self.rear = new_node
        self.length += 1

    def isEmpty(self):
        return self.length == 0

    def dequeue(self):
        if self.isEmpty():
            return "The node is empty."
        temp = self.front
        self.front = temp.next
        self.length -= 1
        if self.front is None:
            self.rear = None
        return temp.data

    def peek(self):
        if self.isEmpty():
            return "The is queue is Empty."
        return self.front.data

    def size(self):
        return self.length

    def print(self):
        temp = self.front
        while temp:
            print(temp.data, end=" -> ")
            temp = temp.next

myqueue = Queue()

myqueue.enqueue(1)
myqueue.enqueue(2)
myqueue.enqueue(3)
print("peek: ",myqueue.peek())
print("dequeue: ",myqueue.dequeue())
print("peek: ",myqueue.peek())
print("size: ", myqueue.size())
print("print the queue: ")
myqueue.print()