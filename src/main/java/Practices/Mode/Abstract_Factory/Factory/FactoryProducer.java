package Practices.Mode.Abstract_Factory.Factory;

public class FactoryProducer {
    public static Animal_Factory Create_Animal(String animal_name){
        if(animal_name.equalsIgnoreCase("Dog")){  // equalsIgnoreCase() 方法比较时不会考虑字符串的大小写
            return new Dog_Factory();
        }
        else if(animal_name.equalsIgnoreCase("Cat")){  // equalsIgnoreCase() 方法比较时不会考虑字符串的大小写
            return new Cat_Factory();
        } else {
            return null;
        }
    }
}
