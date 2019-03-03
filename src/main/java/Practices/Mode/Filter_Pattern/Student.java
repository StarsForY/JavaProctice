package Practices.Mode.Filter_Pattern;
// 1. 先定义一个学生类记录学生信息
public class Student {
    public String name;
    public String sex;
    public String grade;

    public Student(String name, String sex, String grade) {
        this.name = name;
        this.sex = sex;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", grade='" + grade + '\'' +
                '}';
    }
}
