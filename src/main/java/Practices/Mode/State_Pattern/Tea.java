package Practices.Mode.State_Pattern;

public class Tea extends Water {
    public Tea(int temperature) {
        super(temperature);
    }

    public void useWater() {
        if(status.contentEquals("气态")){
            System.out.println("温度太高，水为气态，需要凝结为液态才能泡茶。");
        }else if(status.contentEquals("液态")){
            System.out.println("水为液态可以泡茶。");
        }else{
            System.out.println("温度太低，水为固态，需要融解为液态才能泡茶。");
        }
    }
}
