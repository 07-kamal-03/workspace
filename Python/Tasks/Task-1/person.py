class Student:
    def __init__(self, student_name, student_age, student_id):
        self.student_id = student_id
        self.student_name = student_name
        self.student_age = student_age

    def greeting(self):
        return f"Hello!{self.student_name}, Well Come"
