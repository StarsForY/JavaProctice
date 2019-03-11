package Practices.Mode.Iterator_Pattern;
// 4. 创建迭代器接口
public interface Iterator {
    public Object getFirst();
    public Object getNext();
    public boolean hasNext();
    public Object getPresent();
}
