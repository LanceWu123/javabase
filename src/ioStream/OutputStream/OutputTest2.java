package ioStream.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * ClassName: OutputTest1
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/23 15:51
 * Description:
 */

/**
 *追加写入：在原文件之后写入内容，不覆盖原文件初始内容
 */
public class OutputTest2 {
public static void main(String[] args) throws Exception {
    File file=new File("D://java测试文件.txt");
    OutputStream outputStream=new FileOutputStream(file,true);
    String str="追加,文本";
    byte[] b=str.getBytes();
    //将b字节数组写入到输出流
    outputStream.write(b);
    outputStream.close();

}
}
