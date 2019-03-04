package Practices.Mode.Proxy_Pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
// 动态代理
public class Test_main2 {
    public static void main(String[] args) {
        final foods food = new food1("辣椒炒肉");
        foods proxy = (foods) Proxy.newProxyInstance(
                food.getClass().getClassLoader(),   // 参数一：指定当前目标对象使用类加载器，写法固定
                food.getClass().getInterfaces(),    // 参数二：目标对象实现的接口的类型，写法固定
                new InvocationHandler() {           // 参数三：事件处理接口，需传入一个实现类，一般直接使用匿名内部类
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object returnValue = method.invoke(food, args);// 这里是执行目标对应的方法
                        return returnValue;
                    }
                }
        );
        proxy.shopping_foods();
    }
}
