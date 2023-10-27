letters = ["a", "b", "c", "d", "e"]

# Returns the first item in the list
print(letters[0])

# Returns the last element
print(letters[-1])

# Returns the second element from the end of the list
print(letters[-2])

# Returns elements from '1' to '3' (not included)
print(letters[1:3])

# Returns '0', '1' and '2' elements
print(letters[:3])

numbers = list(range(20))
# Returns every second element
print(numbers[::2])

# Returns every element in the original list
# in the reverse order
print(numbers[::-1])
