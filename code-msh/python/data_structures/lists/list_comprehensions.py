# basic deffinition 
#[expression for item in items]

# Defining a list of tuples
items = [
    ("Product3", 30),
    ("Product4", 40),
    ("Product1", 10),
    ("Product2", 20)
]

# Replace the 'map()' function (from 'lambda_map.py')
prices = [item[1] for item in items]
print(prices)

# Replace the 'filter()' functions (from 'lambda_filter.py')

prices = [price for product, price in items if price > 10]
print(prices)