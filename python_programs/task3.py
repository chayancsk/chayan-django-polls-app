# Python Task 3: List Index Out of Range

def get_element(my_list, index):
    # Bug: Accessing a non-existent index in a list.
    # Fix: Check if index is within the range of the list before accessing.
    return my_list[index]

print(get_element([1, 2, 3], 3))
