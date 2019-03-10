package Practices.Mode.Command_Pattern;
// 4. 创建一个总命令类
public class All_Order {
    private Order order1;
    private Order order2;

    public All_Order(Order order1, Order order2) {
        this.order1 = order1;
        this.order2 = order2;
    }

    public void mp3_start(){
        order1.comply_Order();
    }

    public void mp3_end(){
        order2.comply_Order();
    }

}
