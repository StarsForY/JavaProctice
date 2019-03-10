package Practices.Mode.Command_Pattern;
// 2. 创建一个抽象的命令类
// 描述中应该说的是创建接口，但是我感觉实现类中MP3的属性是公有的，所以这里就创建了一个抽象类
// 但是后面感觉不好，如果不止MP3这一个命令类，那么就必须得写多个抽象类，但是这里只需要执行MP3这一个就好了，就没改
public abstract class Order {
    protected Mp3 mp3 = new Mp3();

    public abstract void comply_Order();
}
