"""
Making of a LinkedList class
"""

# Restoring data as a discreate values in memory
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


# Manipulation with data in LinkedList
class LinkedList:
    def __init__(self):
        self.head = None


    def is_empty(self):
        return self.head is None


    def add(self, data):
        new_node = Node(data)
        if self.is_empty():
            self.head = new_node
        else:
            current = self.head
            while current.next:
                current = current.next

            current.next = new_node
        

    def remove(self, data):
        current = self.head
        if current.data == data:
            if current.next:
                self.head = current.next

            current = None
        else:
            while current.next:
                previous = current
                current = current.next
                if current.data == data:
                    previous.next = current.next
                    current = None
                    break
            else:
                print("None of data provided matches elements in linked list")


    def contain(self, data):
        current = self.head

        if current.data == data:
            print(f"{data} is contained in our linked list")
        else:
            while current.next:
                current = current.next
                if current.data == data:
                    print(f"{data} is contained in our linked list")
                    break
            else:
                print("None of data provided matches elements in linked list")


    def display(self):
        elements = []
        current = self.head
        while current:
            # print(current.__dict__)
            elements.append(current.data)
            current = current.next
        print("LinkedList:", elements)

