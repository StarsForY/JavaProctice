package Practices.Mode.Observer_Pattern;

import java.util.ArrayList;
import java.util.List;
// 3. 创建一个被观察者抽象类
public abstract class FruitShop {
    protected List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public abstract void updateMessage();
}
