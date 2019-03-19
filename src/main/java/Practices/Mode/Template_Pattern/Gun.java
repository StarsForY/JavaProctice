package Practices.Mode.Template_Pattern;
// 2.创建具体的数据填充模板
public class Gun extends Game {
    public void startGame() {
        System.out.println("开局等待一分钟");
    }

    public void gameRunning() {
        System.out.println("搜寻物资20分钟，刚枪一分钟");
    }

    public void gameOver() {
        System.out.println("活着就是胜利");
    }
}
