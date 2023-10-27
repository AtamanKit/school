# Lets sort a list of tuples using a function
items = [
    ("Product2", 20),
    ("Product1", 10),
    ("Product4", 40),
    ("Product3", 30)
]


def sort_items(item):
    return item[1]


items.sort(key=sort_items)
print(items)

# Lets sort a list of tuples using lambda
tuples_list = [
    ("Element2", 20),
    ("Element4", 40),
    ("Element1", 10),
    ("Element3", 30),
]

tuples_list.sort(key=lambda item: item[1])
print(tuples_list)

# Unboxing tuples
for first, last in tuples_list:
    print(first, last)      # Outputs:
                                # Element1 10
                                # Element2 20
                                # Element3 30
                                # Element4 40
                                

