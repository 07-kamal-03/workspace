from main import Person

class Student(Person):
    def __init__(self, name, age, student_id):
        super().__init__(name, age)
        self.student_id = student_id

    def study(self):
        return f"{self.name}({self.student_id}) is studying."





name = "Kamalraj"
age = 23
student_id = "20L221"

student = Student(name, age, student_id)

print(student.greeting(),student.study())