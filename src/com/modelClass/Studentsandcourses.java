package com.modelClass;
import java.util.ArrayList;
import java.util.List;

public class Studentsandcourses {
    public class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
    public class Course {
        private String courseName;
        private List<Student> students;

        public Course(String courseName) {
            this.courseName = courseName;
            this.students = new ArrayList<>();
        }

        public String getCourseName() {
            return courseName;
        }
    }
}
