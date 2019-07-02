package ioStream.OutputStream;

import java.io.*;

/**
 * ClassName: OutputTest1
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/23 15:51
 * Description:
 */

/**
 * 覆盖写入：会将原来文件的内容覆盖
 */
public class OutputTest1 {
public static void main(String[] args) throws Exception {
    File file=new File("D://java测试文件.txt");
    OutputStream outputStream=new FileOutputStream(file);
    String str="文件，写入，流，覆盖";
    byte[] b=str.getBytes();
    //将b字节数组写入到输出流
    outputStream.write(b);
    outputStream.close();

}
}
