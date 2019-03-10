package Practices.Mode.Command_Pattern;
// 3. 创建两个命令实现类继承命令抽象类
public class End_Order extends Order {

    public void comply_Order() {
        mp3.end_mode();
    }
}
