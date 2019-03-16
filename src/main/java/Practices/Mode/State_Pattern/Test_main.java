package Practices.Mode.State_Pattern;

public class Test_main {
    public static void main(String[] args) {
        Water water = new Tea(0);
        water.useWater();
        water.setTemperature(100);
        water.useWater();
        water.setTemperature(50);
        water.useWater();
    }
}
