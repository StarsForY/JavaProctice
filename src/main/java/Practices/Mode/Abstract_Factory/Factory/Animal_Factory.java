package Practices.Mode.Abstract_Factory.Factory;

import Practices.Mode.Abstract_Factory.Animal.Cat;
import Practices.Mode.Abstract_Factory.Animal.Dog;

abstract class Animal_Factory {
    abstract Cat Create_Cat(String Dog_name);
    abstract Dog Create_Dog(String Dog_name);
}
