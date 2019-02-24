package Practices.Mode.Core_Factory_Mode;
// 测试核心工厂模式
public class Animal_main {
    public static void main(String[] args) {
        // 使用核心工厂定义多个类
        Anmial dog = Animal_Factory.create_animal("Dog");
        Anmial cat = Animal_Factory.create_animal("cat");
        Anmial bird = Animal_Factory.create_animal("bird");

        // 测试定义的类是否符合需求
        dog.introduce();
        cat.introduce();
        bird.introduce();
    }
}
