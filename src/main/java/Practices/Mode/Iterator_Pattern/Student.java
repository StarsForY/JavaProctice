package Practices.Mode.Iterator_Pattern;
// 1. 先建一个迭代测试类
public class Student {
    private String name;
    private String sex;
    private String class_num;

    public Student(String name, String sex, String class_num) {
        this.name = name;
        this.sex = sex;
        this.class_num = class_num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", class_num='" + class_num + '\'' +
                '}';
    }
}
