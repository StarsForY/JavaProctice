package Practices.Mode.Adapter_Pattern;
// 4. 然后测试
public class Adapter_main_test {
    public static void main(String[] args) {
        // 第一种方法
        // Adapter_Relized adapterRelized = new Adapter_Relized();
        // adapterRelized.show_three_plug();

        // 第二种方法
        Adapter_Relized_2 relized_2 = new Adapter_Relized_2(new Two_Plug_Relized());
        relized_2.show_three_plug();
    }
}
