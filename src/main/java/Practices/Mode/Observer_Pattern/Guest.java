package Practices.Mode.Observer_Pattern;
// 2. 创建一个顾客类实现观察者接口，实现更新信心的方法
public class Guest implements Observer {
    private String name;

    public Guest(String name) {
        this.name = name;
    }

    public void reciveMessage(String message) {
        System.out.println("顾客 "+this.name+" 收到水果店信息："+message);
    }
}
