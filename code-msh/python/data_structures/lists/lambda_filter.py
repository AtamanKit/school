items = [
    ("Product3", 30),
    ("Product2", 20),
    ("Product1", 10),
    ("Product4", 40)
]

result = list(filter(lambda item:item[1]>20, items))
print("result", result)