package Practices.Mode.Abstract_Factory.Factory;

import Practices.Mode.Abstract_Factory.Animal.Cat;
import Practices.Mode.Abstract_Factory.Animal.Dog;
import Practices.Mode.Abstract_Factory.Animal.Golden_Retriever;
import Practices.Mode.Abstract_Factory.Animal.Husky;

public class Dog_Factory extends Animal_Factory {
    Cat Create_Cat(String Dog_name) {
        return null;
    }

    Dog Create_Dog(String Dog_name){
        if(Dog_name.equalsIgnoreCase("Golden_Retriever")){  // equalsIgnoreCase() 方法比较时不会考虑字符串的大小写
            return new Golden_Retriever();
        }
        else if(Dog_name.equalsIgnoreCase("Husky")){  // equalsIgnoreCase() 方法比较时不会考虑字符串的大小写
            return new Husky();
        } else {
            return null;
        }
    }
}
