# stack_list = []
#
# for i in "Kamal":
#     stack_list.append(i)
#
# print("top element:",stack_list[-1])
#
# print("pop:",stack_list.pop())
#
# print("isEmpty:",not bool(stack_list))

class Stack:
    def __init__(self):
        self.stack = []

    def push(self, val):
        self.stack.append(val)

    def isEmpty(self):
        return len(self.stack) == 0

    def pop(self):
        if self.isEmpty():
            return "The list is Empty."
        return self.stack.pop()

stack_data = Stack()

stack_data.push(1)
stack_data.push(2)
stack_data.push(3)

print(stack_data.pop())

from sortedcontainers import SortedDict