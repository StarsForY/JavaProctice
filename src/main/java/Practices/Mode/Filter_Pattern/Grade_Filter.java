package Practices.Mode.Filter_Pattern;

import java.util.ArrayList;
import java.util.List;

// 3. 实现过滤器接口，这里获取的是高二年级
public class Grade_Filter implements Filter {

    public List<Student> filter(List<Student> students) {
        ArrayList<Student> result = new ArrayList<Student>();
        for(Student student:students){
            if(student.grade.equals("高二")){
                result.add(student);
            }
        }
        return result;
    }
}
