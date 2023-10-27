"""
A 'Stack' class in wish we define
methods for 'stack' manipulation
"""
class Stack:
    def __init__(self, list):
        self.list = list

    
    def pop(self):
        print(len(self.list))
        element = self.list[len(self.list) - 1]
        del self.list[len(self.list) - 1]

        return element

    
    def peek(self):
        return self.list[len(self.list) - 1]
    

    def push(self, element):
        self.list.append(element)
        
        return element


    def display(self):
        print(list(self.list))
        
