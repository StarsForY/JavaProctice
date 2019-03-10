package Practices.Mode.Interpreter_Pattern;
// 2. 创建实现类来实现水果接口，变成具体的水果
public class RealFruit implements Fruit {
    public String fruit_name;

    public RealFruit(String fruit_name) {
        this.fruit_name = fruit_name;
    }

    public boolean exist_Fruit(String question) {
       if(question.contains(fruit_name)){
           return true;
        }
        return false;
    }
}
