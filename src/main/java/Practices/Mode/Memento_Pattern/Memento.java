package Practices.Mode.Memento_Pattern;
// 2. 创建一个备忘录类来记录备份类的状态
public class Memento {
    private Status status;

    public Memento(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        Status clone = status.clone();
        this.status = clone;
    }
}
