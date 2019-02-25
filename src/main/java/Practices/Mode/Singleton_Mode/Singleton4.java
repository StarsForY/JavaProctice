package Practices.Mode.Singleton_Mode;
// 懒汉式（当需要对象时去判断对象存不存在，然后根据情况返回或者创建对象）（使用线程同步，线程安全）（效率低，不建议在多线程下使用）
public class Singleton4 {
    private static Singleton4 singleton4;       // 首先还是要定义这个对象
    private Singleton4(){}                      // 在静态代码块中初始化它
    public static synchronized Singleton4 getSingleton4(){  // 通过Get方法获取对象，这里使用同步方法
        if (singleton4 == null){                // 先判断对象是否存在，不存在则创建，存在则不管
            singleton4 = new Singleton4();
        }
        return singleton4;                      // 返回单例对象
    }
}
