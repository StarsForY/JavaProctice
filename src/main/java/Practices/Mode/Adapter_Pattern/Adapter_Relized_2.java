package Practices.Mode.Adapter_Pattern;
// 3. 第二种实现的方法：使用一个两脚的插头的对象来完成
public class Adapter_Relized_2 implements Three_plug_Inte {
    private Two_Plug_Relized twoPlugRelized;

    public Adapter_Relized_2(Two_Plug_Relized twoPlugRelized) {
        this.twoPlugRelized = twoPlugRelized;
    }

    public void show_three_plug() {
        twoPlugRelized.show_two_plug();
    }
}
