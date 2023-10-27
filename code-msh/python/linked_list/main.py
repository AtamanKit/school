from app_package.module import LinkedList


linked_list = LinkedList()

linked_list.add("Banana")
linked_list.add("Orange")
linked_list.add("Apple")
linked_list.add("Cherry")

linked_list.display()

linked_list.remove("Apple")

linked_list.display()

linked_list.contain("Banana")