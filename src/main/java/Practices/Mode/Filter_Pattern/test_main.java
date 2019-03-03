package Practices.Mode.Filter_Pattern;

import java.util.ArrayList;
import java.util.List;

// 5. 测试
public class test_main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("小红","女","高二"));
        And_Filter andFilter = new And_Filter(new Grade_Filter(), new Sex_Filter());
        List<Student> studentList = andFilter.and_filter(students);
        for (Student s: studentList) {
            System.out.println(s.toString());
        }

    }

}
