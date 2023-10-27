letters = ["a", "b", "c", "d"]

# Basing looping
for letter in letters:
    print(letter)

# Return a tuple of (index, value)
for letter in enumerate(letters):
    print(letter)

# To get the index we use
for letter in enumerate(letters):
    print(letter[0])

# To get the value we use
for letter in enumerate(letters):
    print(letter[1])

# Another way to unpack
for index, letter in enumerate(letters):
    print(index, letter)