package Practices.Mode.Command_Pattern;
// 5. 测试
public class Test_main {
    public static void main(String[] args) {
        Order startOrder = new Start_Order();
        Order endOrder = new End_Order();

        All_Order order = new All_Order(startOrder, endOrder);

        order.mp3_start();

        order.mp3_end();
    }
}
