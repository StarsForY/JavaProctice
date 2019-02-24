package Practices.Mode.Abstract_Factory.Factory;

import Practices.Mode.Abstract_Factory.Animal.Dog;

// 抽象工厂练习
public class Animal_main {
    public static void main(String[] args) {
        // 1. 首先通过动物工厂创建有关狗类的工厂
        Animal_Factory dog_Factory = FactoryProducer.Create_Animal("Dog");
        // 2. 通过狗类的工厂创建与狗有关的对象
        Dog goldenRetriever = dog_Factory.Create_Dog("Golden_Retriever");
        Dog husky = dog_Factory.Create_Dog("Husky");
        // 3. 测试返回的对象
        goldenRetriever.introduce();
        husky.introduce();
    }
}
