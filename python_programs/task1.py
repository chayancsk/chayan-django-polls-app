# Python Task 1: Division Bug

def safe_divide(a, b):
    # Bug: Division by zero error.
    # Fix: Add a condition to check if b is zero before dividing.
    return a / b

print(safe_divide(10, 0))
