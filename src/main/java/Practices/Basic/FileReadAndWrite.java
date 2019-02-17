package Practices.Basic;

import java.io.*;

public class FileReadAndWrite {
    public static void main(String[] args) throws IOException {

        File f = new File("test.txt");                  // 新建一个文件
        FileOutputStream outputStream = new FileOutputStream(f);    // 开启一个文件的输出流，注意这里需要抛出异常或者try-catch
        // OutputStreamWriter是从字符流到字节流的桥接：使用指定的字符集将写入其中的字符编码为字节。
        OutputStreamWriter writer = new OutputStreamWriter(outputStream, "utf-8");

        FileInputStream inputStream = new FileInputStream(f);       // 开启一个文件的输入流
        // InputStreamReader是从字节流到字符流的桥接：提前从底层流读取更多的字节，使其超过满足当前编码格式所需的字节，然后转换成字符输出。
        InputStreamReader reader = new InputStreamReader(inputStream, "utf-8");

        writer.append("中文输入");  // 数据先写入到缓冲区，之后刷新缓冲区时才会写入文件中
        writer.append("\r\n");
        writer.append("English");
        // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入
        writer.close();             // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
        outputStream.close();       // 关闭输出流,释放系统资源

        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());    // 转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        reader.close();                         // 关闭读取流
        inputStream.close();                    // 关闭输入流,释放系统资源
    }
}
