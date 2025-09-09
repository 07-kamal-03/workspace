# def sum_numbers(nums):
#     print(sum(nums))
#
# def multiply_numbers(nums):
#     mul = nums[0]
#     for i in nums:
#         mul *= i
#     print(mul)
#
# def min_max(nums):
#     print(max(nums))
#     print(min(nums))
#
#
# nums = [1, 2, 3, 4, 5]
#
# sum_numbers(nums)
# multiply_numbers(nums)
# min_max(nums)
#
from curses.ascii import isalpha


# --------------------------------------------------------------------


# def add_skill(person, skill):
#     updatedPerson = person["skills"].append(skill)
#
# def print_person(person):
#
#     for key, value in person.items():
#         print(key,": ",value)
#
#
#
#
# person = {
#     "name": "Kamal",
#     "age": 25,
#     "skills": ["Python", "Git"]
# }
#
# add_skill(person, "Java")
#
# print_person(person)


# -------------------------------------------------------------------


# def count_vowels_consonants(string):
#     vowel = 0
#     consonant = 0
#     for c in string:
#         if c.isalpha():
#             if c in "aeiou":
#                 vowel += 1
#             else:
#                 consonant += 1
#     return {"vowels":vowel, "consonant":consonant}
#
#
#
#
# result = count_vowels_consonants("Hello Python")
# print(result)

# -----------------------------------------------------------------------

# def get_user_info():
#     name = input("Enter your name: ")
#     age = int(input("Enter your age: "))
#     skills = input("Enter your skills (comma-separated): " ).split(",")
#     skills = [skill.strip() for skill in skills]
#
#     user_info = {"name":name, "age":age, "skills":skills}
#     return user_info
#
# def print_user_info(infos):
#     for key, value in infos.items():
#         print(key,": ",value)
#
# print_user_info(get_user_info())

# ----------------------------------------------------------------------

# def write_to_file(filename, txt):
#     with open(filename, 'w') as file:
#         file.write(txt)
#
# def read_from_file(filename):
#     with open(filename, 'r') as file:
#         return file.read()
#
# filename = "R&D"
# txt = "Hello! I am kamalraj."
#
# write_to_file(filename, txt)
# print(read_from_file(filename))

# ----------------------------------------------------------------------

# ******OOPS*******

# class Person:
#     def __init__(self, name, age):
#         self.name = name
#         self.age = age
#
#     def greeting(self):
#         return f"Hello! I am {self.name} and I am {self.age} years old."

# ---------------------------------------------------------------------------

# try:
#     x = int(input("what is the x? "))
# except Exception as e:
#     print(e)
# else:
#     print(x)


# --------------------------------------------------------------------------

# def demo(a,b,c):
#     print(a+b+c)
#
# nums = (1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1)
# demo()
#
# def demo(**kwargs):
#     print(kwargs)
#
# nums = {"name":"kamal", "age":23}
# demo(**nums)

# ------------------------------------------------------------------------
import time
def timer(func):
    def wrapper(*args, **kwargs):
        start = time.time()
        result = func(*args, **kwargs)
        end = time.time()
        print("Execution time taken: ", round(end-start, 5))
        return result
    return wrapper

@timer
def demo():
    for i in range(10):
        print("Kamalraj")


demo()