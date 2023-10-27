"""
A basic algorithm of making a stack from an array
"""
from pkg.stack import Stack


numbers = [100, 200, 300]

stack = Stack(numbers)

stack.display()

stack.pop()
stack.display()

print(stack.peek())

stack.push(400)
stack.display()

