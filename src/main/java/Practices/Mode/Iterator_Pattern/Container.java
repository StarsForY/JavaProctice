package Practices.Mode.Iterator_Pattern;
// 2. 创建容器接口
public interface Container {
    public void add(Object ob);
    public void remove(Object ob);
    public Iterator iterator();
}
