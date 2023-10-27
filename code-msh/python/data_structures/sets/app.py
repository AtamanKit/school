numbers = [2, 2, 1, 3, 4, 1, 2, 3]


unique = set(numbers)
print(unique)           # Outputs: {1, 2, 3, 4}


# We can use methods with sets
second = {1, 4}
second.add(3)
print(second)       # Outputs: {1, 2, 4}

second.remove(3)
len(second)


# Union of sets
first = set(numbers)
second = {1, 7}
print(first | second)       # Outputs: {1, 2, 3, 4, 7}


# Intersection of the set
print(first & second)       # Outputs: {1}


# Diference of the two sets
print(first - second)       # Outputs: {2, 3, 4}


# Simetric differense (either in the 'first' or 'second'
# sets but not both)
print(first ^ second)       # Outputs: {2, 3, 4, 7}


