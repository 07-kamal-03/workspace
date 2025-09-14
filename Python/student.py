# from main import Person
#
# class Student(Person):
#     def __init__(self, name, age, student_id):
#         super().__init__(name, age)
#         self.student_id = student_id
#
#     def study(self):
#         return f"{self.name}({self.student_id}) is studying."
#
#
#
#
#
# name = "Kamalraj"
# age = 23
# student_id = "20L221"
#
# student = Student(name, age, student_id)
#
# print(student.greeting(),student.study())
y=10
a = [8, 2, 9, 4, 9]
# discount_cost = [0 if i-y<0 else i-y for i in a ]
# print(discount_cost)
# print(min(a))

a.sort()
print(a)
d = list(set(a))
print(d)
print(d[-1] + d[-2])