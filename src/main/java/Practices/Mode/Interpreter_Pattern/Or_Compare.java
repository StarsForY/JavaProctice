package Practices.Mode.Interpreter_Pattern;
// 4. 比较是否存在其中一种
public class Or_Compare {
    private Fruit fruit1;
    private Fruit fruit2;

    public Or_Compare(Fruit fruit1, Fruit fruit2) {
        this.fruit1 = fruit1;
        this.fruit2 = fruit2;
    }

    public void Compare(String sentence){
        if(fruit1.exist_Fruit(sentence) || fruit2.exist_Fruit(sentence)){
            System.out.println("至少存在其中一种");
        }else{
            System.out.println("不存在");
        }
    }
}
