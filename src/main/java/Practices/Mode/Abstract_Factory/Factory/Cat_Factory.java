package Practices.Mode.Abstract_Factory.Factory;

import Practices.Mode.Abstract_Factory.Animal.Cat;
import Practices.Mode.Abstract_Factory.Animal.Dog;
import Practices.Mode.Abstract_Factory.Animal.Folds;
import Practices.Mode.Abstract_Factory.Animal.Orange_cat;

public class Cat_Factory extends Animal_Factory {

    public Cat Create_Cat(String Dog_name){
        if(Dog_name.equalsIgnoreCase("Orange_cat")){  // equalsIgnoreCase() 方法比较时不会考虑字符串的大小写
            return new Orange_cat();
        }
        else if(Dog_name.equalsIgnoreCase("Folds")){  // equalsIgnoreCase() 方法比较时不会考虑字符串的大小写
            return new Folds();
        } else {
            return null;
        }
    }Dog Create_Dog(String Dog_name) {
        return null;
    }
}
