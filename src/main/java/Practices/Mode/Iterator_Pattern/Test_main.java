package Practices.Mode.Iterator_Pattern;

import java.util.ArrayList;
import java.util.List;
// 6. 测试
public class Test_main {
    public static void main(String[] args) {
        List<Object> students = new ArrayList<Object>();

        Student jack = new Student("jack", "m", "1");
        Student rose = new Student("rose", "w", "2");
        Student locy = new Student("locy", "w", "1");

        students.add(jack);
        students.add(rose);

        ConcreteAggregate aggregate = new ConcreteAggregate(students);
        aggregate.add(locy);

        Iterator iterator = aggregate.iterator();

        while(iterator.hasNext()){
            Object next = iterator.getNext();
            System.out.println(next.toString());
        }
    }
}
