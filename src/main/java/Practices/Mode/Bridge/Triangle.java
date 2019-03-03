package Practices.Mode.Bridge;
// 4. 继承图形的抽象类，重写其的抽象方法
public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    public void Drowing() {
        color.show_Color();
        System.out.println("当前图形是三角形");
    }
}
