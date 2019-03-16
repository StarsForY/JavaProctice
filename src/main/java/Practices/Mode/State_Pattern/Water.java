package Practices.Mode.State_Pattern;

public abstract class Water {
    protected int temperature;
    protected String status;

    public Water(int temperature) {
        this.temperature = temperature;
        if(temperature >= 100){
            this.status = "气态";
        }else if(temperature <100 && temperature >0){
            this.status = "液态";
        }else{
            this.status = "固态";
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        if(temperature >= 100){
            this.status = "气态";
        }else if(temperature <100 && temperature >0){
            this.status = "液态";
        }else{
            this.status = "固态";
        }
    }

    public abstract void useWater();
}
