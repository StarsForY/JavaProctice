package Practices.Mode.Singleton_Mode;
// 1.饿汉式（因为对象只存在一个，这里的对象以静态常量存储在类中）（一般情况下可用）
// 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
// 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
public class Singleton1 {
    public static final Singleton1 singleton1 = new Singleton1(); // 单例对象定义为静态常量

    private Singleton1(){}      // 将构造方法私有化，禁止使用构造方法new出对象

    public static Singleton1 getSingleton1(){
        return singleton1;
    }
}
