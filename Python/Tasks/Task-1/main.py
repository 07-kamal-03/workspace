from person import Student
import json


def create_student_record(student_name,student_age,student_id):
    with open("student_record.txt", "w") as file:
        data = {
            "Student name": student_name,
            "Student age": student_age,
            "Student id": student_id
        }
        json.dump(data, file)
        print("Student recorded succesfully.")

def read_student_record():
    with open("student_record.txt", "r") as file:
        read = file.read()
        print(read)

student_name = str(input("Enter your name: "))
student_age = int(input("Enter your age: "))
student_id = str(input("Enter your id: "))

std = Student(student_name,student_age,student_id)

create_student_record(student_name, student_age, student_id)
read_student_record()