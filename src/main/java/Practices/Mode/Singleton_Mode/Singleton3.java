package Practices.Mode.Singleton_Mode;
// 3.懒汉式（当需要对象时去判断对象存不存在，然后根据情况返回或者创建对象）（线程不安全）（不建议在多线程下使用）
// 这种写法起到了Lazy Loading的效果，但是只能在单线程下使用。如果在多线程下，
// 一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，
// 这时便会产生多个实例。所以在多线程环境下不可使用这种方式。
public class Singleton3 {
    private static Singleton3 singleton3;       // 首先还是要定义这个对象

    private Singleton3(){}                      // 在静态代码块中初始化它

    public static Singleton3 getSingleton3(){  // 通过Get方法获取对象
        if (singleton3 == null){                // 先判断对象是否存在，不存在则创建，存在则不管
            singleton3 = new Singleton3();
        }
        return singleton3;                      // 返回单例对象
    }
}
