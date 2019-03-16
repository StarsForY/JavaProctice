package Practices.Mode.Memento_Pattern;
// 4. 测试
public class Test_main {
    public static void main(String[] args) {
        Game game = new Game(new Status(100));
        game.getMoney(50);
        game.createMemento();
        game.loseMoney(100);
        game.loadMemento();
    }
}
