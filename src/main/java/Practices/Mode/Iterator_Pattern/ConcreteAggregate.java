package Practices.Mode.Iterator_Pattern;

import java.util.List;
// 3. 创建容器的实现类
public class ConcreteAggregate implements Container {
    private List<Object> list;

    public ConcreteAggregate(List<Object> list) {
        this.list = list;
    }


    public void add(Object ob) {
        list.add(ob);
    }

    public void remove(Object ob) {
        list.remove(ob);
    }

    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
