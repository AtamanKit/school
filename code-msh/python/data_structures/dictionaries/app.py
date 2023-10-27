# Two ways of defining a dictionary
point = {"x": 1, "y": 2}
point = dict(x=1, y=2)

# Access a value by its key
print(point["x"])       # Outputs: 1

print(point.get("x"))   # Outputs: 1
# If key-value pair exist outputs: value, if not: 0
print(point.get("a", 0))


# Add another value
point["z"] = 20
print(point)        # Outputs: {"x": 1, "y": 2, "z": 20}

# Delete a value
del point["z"]
print(point) # Outputs: {"x": 1, "y": 2}

# If statement
if "x" in point:
    print(point["x"])


# Loop over a dictionary
for key in point:
    print(key)      # Output :
                    # x
                    # y


for key in point:
    print(key, point[key])  # Outputs:
                            # x 1
                            # y 2

for element in point.items():
    print(element)              # Outputs tuples:
                                # ('x', 1)
                                # ('y', 2)

for key, value in point.items():
    print(key, value)           # Outputs:
                                # x 1
                                # y 2