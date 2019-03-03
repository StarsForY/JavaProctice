package Practices.Mode.Bridge;
// 4. 继承图形的抽象类，重写其的抽象方法
public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    public void Drowing() {
        color.show_Color();
        System.out.println("当前图形是正方形！");
    }
}
