package Practices.Mode.Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

// 1. 定义一个学生类，包括学生姓名和学生职务
// 待会测试的时候是按学生职务进行组合的
public class Student {
    private String name;
    private String position;

    private List<Student> students;

    public Student(String name, String position) {
        this.name = name;
        this.position = position;
        this.students = new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void add_student(Student student){
        students.add(student);
    }

    public void remove_student(Student student){
        students.remove(student);
    }

    public List<Student> getStudents(){
        return students;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
