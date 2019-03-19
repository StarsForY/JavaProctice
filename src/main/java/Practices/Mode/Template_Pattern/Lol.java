package Practices.Mode.Template_Pattern;
// 2.创建具体的数据填充模板
public class Lol extends Game {
    public void startGame() {
        System.out.println("选择你要玩的英雄");
    }

    public void gameRunning() {
        System.out.println("追求五杀的梦想");
    }

    public void gameOver() {
        System.out.println("推掉水晶获得胜利");
    }
}
