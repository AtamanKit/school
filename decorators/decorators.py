"""
A decorator function that uses a simple wrapper
"""
def uppercase_decorator(function):
    def wrapper():
        func = function()
        make_uppercase = func.upper()

        return make_uppercase

    return wrapper

@uppercase_decorator
def say_hi():
    return 'Hello There'

print(say_hi())

"""
The code below without wrapper not working
"""
# def capitalized_decorator(func):
#     original_result = func()
#     capitalized_result = original_result.upper()

#     return capitalized_result

# @capitalized_decorator
# def greet():
#     return "Hello!"

# print(greet())

"""
A decorator function that receives arguments
"""
def repeat(num_times):
    def decorator_repeat(func):
        def wrapper(*args, **kargs):
            for _ in range(num_times):
                result = func(*args, **kargs)

            return result
    
        return wrapper
    
    return decorator_repeat
    
    return wrapper


@repeat(3)
def say_hello(name):
    print(f"Hello {name}!")

say_hello("Rodion")