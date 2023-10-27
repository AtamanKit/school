""""
Here we provide the difference between
mutable and immutable objects

We use two cases:
1. Createng two equal lists:
    'my_list = my_numbers'
    and by modifiyng values in one list 'my_list' in
    'my_numbers' the values also modifies thus showing that
    lists ar mutable objects

2. Creating two equal integer variables:
    'a = b' and by modifiyng the value to variable 'a'
    'b' will not change its value. Thus showing us that
    integers are not mutable or immutable
"""

# 1. Two equal lists objects creation 
my_list = my_numbers = [1, 2, 3]

print("my_list:", my_list)
print("my_numbers:", my_numbers)

my_list.pop()

print("my_list:", my_list)
print("my_numbers:", my_numbers)

# 2. Two equal integers creation
a = b = 3

print("a", a)
print("b", b)

a = 4

print("a", a)
print("b", b)