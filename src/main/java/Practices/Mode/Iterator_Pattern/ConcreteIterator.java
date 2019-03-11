package Practices.Mode.Iterator_Pattern;

import java.util.List;
// 5. 创建迭代器的实现类
public class ConcreteIterator implements Iterator {
    private List<Object> list;
    private int index = 0;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    public Object getFirst() {
        if(list.size() == 0){
            System.out.println("迭代对象已经全部被移除");
            return null;
        }else{
            index = 1;      // 索引指向0 的后一个元素
            return list.get(0);
        }
    }

    public Object getNext() {
        if(hasNext()){
            index += 1;
            return  list.get(index-1);
        }else{
            System.out.println("没有下一个元素");
            return null;
        }
    }

    public boolean hasNext() {
        if(index >= list.size()){
            return false;
        }else {
            return true;
        }
    }

    public Object getPresent() {
        if(index == 0){
            if(list.get(0) == null){
                System.out.println("没有迭代的对象");
                return null;
            }else{
                return list.get(0);
            }
        }else{
            if(index -1 >= list.size()){
                System.out.println("当前索引位置没有元素");
                return null;
            }else{
                return list.get(index - 1);
            }
        }
    }
}
