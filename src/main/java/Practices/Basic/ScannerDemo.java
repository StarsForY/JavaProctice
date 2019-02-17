package Practices.Basic;

import java.util.Scanner;

/**
 * 输入多个数字，并求其总和与平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果
 */
class ScannerDemo{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);  // 获取scanner对象

        double sum = 0;     // 记录和
        int m = 0;          // 记录输入了多少个数

        while(scan.hasNextDouble()){             // 判断时候还有Double类型的数据输入
            double x = scan.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的平均值是"+(sum/m));
    }
}
