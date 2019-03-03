package Practices.Mode.Filter_Pattern;

import java.util.List;

// 2. 定义一个过滤器的接口，包含一个过滤的方法，所有过滤器都实现这个接口，
public interface Filter {
    public List<Student> filter(List<Student> students);
}
