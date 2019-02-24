package Practices.Mode.Core_Factory_Mode;

// 核心工厂模式类
public class Animal_Factory {
    // 核心工厂模式实现的方法，返回值是一个实现类
    public static Anmial create_animal(String animal_name){
        if(animal_name.equalsIgnoreCase("Dog")){  // equalsIgnoreCase() 方法比较时不会考虑字符串的大小写
            return new Dog();
        }
        else if(animal_name.equalsIgnoreCase("Cat")){  // equalsIgnoreCase() 方法比较时不会考虑字符串的大小写
            return new Cat();
        }
        else if(animal_name.equalsIgnoreCase("Bird")){  // equalsIgnoreCase() 方法比较时不会考虑字符串的大小写
            return new Bird();
        }else {
            return null;
        }
    }
}
