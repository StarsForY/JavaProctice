package Practices.Mode.Memento_Pattern;
// 1. 新建一个属性类，这里假设备份游戏中的金钱
public class Status implements Cloneable {
    private int money;

    public Status(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    protected Status clone(){
       Status st = null;
       try {
           st = (Status)super.clone();
       }catch (CloneNotSupportedException e){
            e.printStackTrace();
       }
       st.money = this.money;
       return st;
    }
}
