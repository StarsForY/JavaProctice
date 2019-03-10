package Practices.Mode.Interpreter_Pattern;
// 3. 比较是否同时存在
public class And_Copmare {
    private Fruit fruit1;
    private Fruit fruit2;

    public And_Copmare(Fruit fruit1, Fruit fruit2) {
        this.fruit1 = fruit1;
        this.fruit2 = fruit2;
    }

    public void Compare(String sentence){
        if(fruit1.exist_Fruit(sentence) && fruit2.exist_Fruit(sentence)){
            System.out.println("同时存在");
        }else{
            System.out.println("不同时存在");
        }
    }
}