package Practices.Mode.Filter_Pattern;

import java.util.List;

// 4. 这里创建一个组合过滤类，用来实现选定两个筛选条件过滤
public class And_Filter {
    private Filter filter1;
    private Filter filter2;

    public And_Filter(Filter filter1, Filter filter2) {
        this.filter1 = filter1;
        this.filter2 = filter2;
    }

    // 入参时，第一个过滤选高二年级，第二个过滤选女生，实现选择高二女生的过滤
    public List<Student> and_filter(List<Student> students){
        List<Student> tmp = filter1.filter(students);
        List<Student> result = filter2.filter(tmp);
        return result;
    }
}
