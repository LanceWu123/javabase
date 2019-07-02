package ioStream.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * ClassName: InputTest1
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/22 21:22
 * Description:
 */

public class InputTest1 {
public static void main(String[] args) throws Exception{
    File file=new File("D://java测试文件.txt");
    InputStream inputStream = new FileInputStream(file) ;
    byte []b=new byte[(int) file.length()];
    inputStream.read(b);
    inputStream.close();
        //视情况而定，看是否需要改变编码格式
    // eg；将new String(b)写为new String(b,"gbk")或new String(b,"UTF-8")
    System.out.println("读取的内容是:"+new String(b));
}
}
