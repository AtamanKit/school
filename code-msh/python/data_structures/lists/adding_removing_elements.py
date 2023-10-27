letters = ["a", "b", "c"]

# Adding element at the end of a list
letters.append("d")
print(letters)          # Outputs: ['a', 'b', 'c', 'd']

# Adding element at the specific index
letters.insert(2, 3)
print(letters)          # Outputs: ['a', 'b', 3, 'c', 'd']    

# Removing the last element
letters.pop()
print(letters)          # Outputs: ['a', 'b', 3, 'c']

# Removing element at the specific index
letters.pop(2)
print(letters)          # Outputs: ['a', 'b', 'c']

# Remove the first occurance of the letters "b"
letters.remove("b")
print(letters)          # Outputs: ['a', 'c']

# Another way to delete
del letters[0]
print (letters)         # Outputs: ['c']

# Delete a range of elements
numbers = list(range(10))
print(numbers)          # Outputs: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
del numbers[2:5]
print(numbers)          # Outputs: [0, 1, 5, 6,7, 8 ,9]

# Remove all elements in the list
numbers.clear()
print(numbers)          # Outputs: []