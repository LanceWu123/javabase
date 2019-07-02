package ioStream.Reader;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/**
 * ClassName: ReaderTest1
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/23 17:15
 * Description:
 */

public class ReaderTest1 {
public static void main(String[] args)throws Exception{
    File file=new File("D://java测试文件.txt");
    Reader reader=new FileReader(file);
    char []c=new char[1024];
    int len=reader.read(c);
    reader.close();
    System.out.println("读取的内容为："+new String(c,0,len));
}
}
