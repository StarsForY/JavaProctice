package Practices.Basic;

import java.io.*;

/**
 * 从文本文件test.txt中读取5行，并转换成大写字母，最后保存在另一个文件test1.txt中。
 */
public class DataStreamTest{
    public static void main(String args[])throws IOException {

        DataInputStream d = new DataInputStream(new FileInputStream("test.txt"));
        DataOutputStream out = new DataOutputStream(new FileOutputStream("test1.txt"));

        String count;
        while((count = d.readLine()) != null){
            String u = count.toUpperCase();
            System.out.println(u);
            out.writeBytes(u + "  ,");
        }
        d.close();
        out.close();
    }
}
