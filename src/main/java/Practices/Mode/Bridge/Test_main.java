package Practices.Mode.Bridge;
// 5. 测试
public class Test_main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new Red_Color());
        Shape square = new Square(new Green_Color());

        triangle.Drowing();
        square.Drowing();
    }
}
