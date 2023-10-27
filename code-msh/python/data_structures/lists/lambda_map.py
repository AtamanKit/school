items = [
    ("Product3", 30),
    ("Product2", 20),
    ("Product4", 40),
    ("Product1", 10)
]

prices = list(map(lambda item:item[1], items))

print(prices)