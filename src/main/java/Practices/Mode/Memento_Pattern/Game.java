package Practices.Mode.Memento_Pattern;
// 3. 创建一个游戏来实现属性的变化
public class Game {
    private Status status;
    private Memento memento;

    public Game(Status status) {
        this.status = status;
        this.memento = new Memento(status);
    }

    public void getMoney(int mm){
        status.setMoney(status.getMoney()+mm);
        System.out.println("获取金钱："+mm+",当前金钱："+status.getMoney());
    }

    public void loseMoney(int lm){
        status.setMoney(status.getMoney()-lm);
        System.out.println("失去金钱："+lm+",当前金钱："+status.getMoney());
    }

    public void createMemento(){
        memento.setStatus(this.status);
        System.out.println("创建备份，当前金钱："+status.getMoney());
    }

    public void loadMemento(){
        Status status = memento.getStatus().clone();
        this.status = status;
        System.out.println("还原备份，当前金钱为："+status.getMoney());
    }
}
