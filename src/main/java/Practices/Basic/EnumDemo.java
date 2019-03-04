package Practices.Basic;

import java.util.Random;

public class EnumDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        EnumDemo1 enums[] = EnumDemo1.values();
        Random random = new Random();
        EnumDemo1 ed = enums[random.nextInt(enums.length)];
        getEnumDemo1(ed);
    }

    /**
     * 打印方法
     * @param ed EnumDemo1枚举
     */
    public static void getEnumDemo1(EnumDemo1 ed){
        System.out.print(ed.toString());
    }

    public enum EnumDemo1 {
        CASE1 , CASE2 , CASE3
    }

}
