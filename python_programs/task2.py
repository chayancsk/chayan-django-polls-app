# Python Task 2: String Formatting Bug

def greet(name):
    # Bug: Incorrect string formatting causing TypeError.
    # Fix: Use .format() correctly or switch to f-string.
    message = "Hello, {}!".format(name)
    return message

print(greet(123))
