package Practices.Mode.Bridge;
// 3. 在定义一个图形的抽象类，包含一个颜色的接口的属性，构造方法初始化它，还有一个画图的抽象方法
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void Drowing();
}
