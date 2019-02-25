package Practices.Mode.Singleton_Mode;
// 6.双重检查[推荐用]
// 这里有一个重要的点，就是 volatile 关键字
public class Singleton6 {
    private static volatile  Singleton6 singleton6;       // 首先还是要定义这个对象
    private Singleton6(){}                       // 在静态代码块中初始化它
    public static Singleton6 getSingleton6(){  // 通过Get方法获取对象
        if (singleton6 == null){                // 先判断对象是否存在，不存在则创建，存在则不管
            synchronized (Singleton6.class){   // 同步代码块
                if (singleton6 == null) {       // 再次判断对象是否存在，不存在则创建，存在则不管
                    singleton6 = new Singleton6();
                }
            }
        }
        return singleton6;                      // 返回单例对象
    }
}
