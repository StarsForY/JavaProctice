package Practices.Mode.Proxy_Pattern;
// 4. 测试
public class Test_main {
    public static void main(String[] args) {
        Send_Food_people send_food_people = new Send_Food_people();
        send_food_people.getfood();
    }
}
