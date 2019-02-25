package Practices.Mode.Singleton_Mode;
// 2. 饿汉式（这里将对象放到静态代码块中，静态代码块只有在类加载的时候才加载，所以也只会加载一次）（一般情况下可用）
// 优点：这种写法比较简单，就是在类加载的时候就完成实例化。避免了线程同步问题。
// 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
public class Singleton2 {
    public static Singleton2 singleton2 ;       // 首先还是要定义这个对象
    static {
        singleton2 = new Singleton2();           // 在静态代码块中初始化它
    }
    private Singleton2(){}                      // 私有化构造方法，避免通过new创建对象
    public static Singleton2 getSingleton2(){  // 通过Get方法获取对象
        return singleton2;
    }
}
