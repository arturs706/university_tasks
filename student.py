class Student:
    def __init__(self, name, age, course, ID):
        self.name = name
        self.age = age
        self.course = course
        self.ID = ID


    def print_details(self):
        print("Name: " + self.name)
        print("Age: " + str(self.age))
        print("Course: " + self.course)
        print("Student ID: " + self.ID)


student1 = Student("Bob", 20, "Computer Science", "1000121")
student2 = Student("Alice", 21, "Computer Science", "1000475")
student3 = Student("Jane", 18, "Information Technology", "1000823")
student1.print_details()
student2.print_details()
student3.print_details()


#4 variable for assigning 4 different values - name, age, course name, student id. Split method separates strings with commas and space.
st_name, st_age, st_course, st_id = input('\nPlease enter the new students name, age, course name and student number:\n\n').split(", ")
#Assigns Class 'Student' to a new object named student4 
student4 = Student(st_name, st_age, st_course, st_id)
#Calls print_details function with a new objects details
student4.print_details()
