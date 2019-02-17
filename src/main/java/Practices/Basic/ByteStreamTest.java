package Practices.Basic;

import java.io.*;
public class ByteStreamTest {
    public static void main(String args[])throws IOException {
        // 创建一个字节数组输出流，后面参数为缓冲区大小(单位字节)
        ByteArrayOutputStream boutputStream = new ByteArrayOutputStream(12);
        while(boutputStream.size() < 10){
            boutputStream.write(System.in.read());      // 获取用户输入
        }
        byte[] bytes = boutputStream.toByteArray();     // 将读到的数据转换成数组
        System.out.println("Print the content");
        for(int x= 0 ; x < bytes.length; x++) {        // 将转换后的数组打印出来
            System.out.print((char)bytes[x]  + "   ");
        }
        boutputStream.close();
        System.out.println();
        int c;
        // 创建一个字节数组输入流，以接收的数组大小来开辟内存缓冲区大小
        ByteArrayInputStream binputStream = new ByteArrayInputStream(bytes);
        System.out.println("Converting characters to Upper case " );

        for(int y = 0 ; y < 1; y++ ) {          // 循环读取数组里的每一个元素，读取完毕后得到的值为-1
            while(( c= binputStream.read())!= -1) {
                System.out.print(Character.toUpperCase((char)c) + "   ");   // 这里将读到的数据转成大写后输出
            }
            binputStream.close();
        }
    }
}
