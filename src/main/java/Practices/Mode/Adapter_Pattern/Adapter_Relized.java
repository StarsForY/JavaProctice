package Practices.Mode.Adapter_Pattern;
// 3. 然后定义适配器模式，将三脚插头转接到二脚插头上（就是调用二脚插头的方法）
public class Adapter_Relized extends Two_Plug_Relized implements Three_plug_Inte {
    public void show_three_plug() {
        show_two_plug();
    }
}
