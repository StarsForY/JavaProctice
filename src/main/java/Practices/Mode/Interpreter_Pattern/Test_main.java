package Practices.Mode.Interpreter_Pattern;
// 5. 测试
public class Test_main {
    public static void main(String[] args) {
        Fruit apple = new RealFruit("苹果");
        Fruit banana = new RealFruit("香蕉");
        And_Copmare andCopmare = new And_Copmare(apple, banana);
        Or_Compare orCompare = new Or_Compare(apple, banana);

        String sentence = new String(new StringBuffer("篮子里有梨或者苹果吗"));

        if(sentence.contains("和")){
            andCopmare.Compare(sentence);
        }
        if (sentence.contains("或")){
            orCompare.Compare(sentence);
        }
    }
}
