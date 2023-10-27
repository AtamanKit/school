numbers = [1, 2, 3]

first, second, third = numbers

# Returns elements from the array
print(first)
print(second)
print(third)


new_numbers = list(range(10))

first, second, *other = numbers

# Returns all the elements in the array
# 'first' and 'second' corresponds to the first
# two elements of ther array, '*other' to others
# elements
print(first)
print(second)
print(*other)


def multiply(*numbers):
    pass

multiply(1, 2, 3, 4)
