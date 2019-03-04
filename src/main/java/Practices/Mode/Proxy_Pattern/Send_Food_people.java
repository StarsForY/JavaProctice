package Practices.Mode.Proxy_Pattern;

import java.util.Random;

// 3. 创建一个代理类，根据外卖派送员的状态来决定送不送这份外卖
public class Send_Food_people {
    private foods food;

    public Send_Food_people() {
        this.food = new food1("鱼香茄子");
    }

    public void getfood(){
        Status enums[] = Status.values();
        Random random = new Random();
        Status ed = enums[random.nextInt(enums.length)];

        if(ed==Status.busy){
            System.out.println("业务繁忙，暂不接单");
        }else{
            food.shopping_foods();
        }
    }
}


// 使用枚举定义外卖派送员的状态
enum Status{
    busy,
    idle;
}
