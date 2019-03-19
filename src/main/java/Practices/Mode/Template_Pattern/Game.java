package Practices.Mode.Template_Pattern;
// 1. 新建一个游戏的接口
public abstract class Game {
    public abstract void startGame();
    public abstract void gameRunning();
    public abstract void gameOver();

    public void changeGame(){
        startGame();
        gameRunning();
        gameOver();
    }
}
