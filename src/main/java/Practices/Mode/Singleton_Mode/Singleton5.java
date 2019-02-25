package Practices.Mode.Singleton_Mode;
// 5. 懒汉式（当需要对象时去判断对象存不存在，然后根据情况返回或者创建对象）（虽说有线程限制，但是还是可能创建多个实例）（不建议在多线程下使用）
public class Singleton5 {
    private static Singleton5 singleton5;       // 首先还是要定义这个对象
    private Singleton5(){}                       // 在静态代码块中初始化它
    public static Singleton5 getSingleton6(){  // 通过Get方法获取对象
        if (singleton5 == null){                // 先判断对象是否存在，不存在则创建，存在则不管
            synchronized (Singleton5.class){   // 同步代码块
                singleton5 = new Singleton5();
            }
        }
        return singleton5;                      // 返回单例对象
    }
}
