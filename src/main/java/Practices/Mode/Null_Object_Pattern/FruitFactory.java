package Practices.Mode.Null_Object_Pattern;

public class FruitFactory {
    public Fruit getFruit(int num){
        Fruit fruit;
        switch (num){
            case 1:
                fruit = new Apple();
                break;
            case 2:
                fruit = new Banana();
                break;
            default:
                fruit = new NullFruit();
                break;
        }
        return fruit;
    }
}
