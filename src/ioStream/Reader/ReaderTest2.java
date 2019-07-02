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

/**
 * 与ReaderTest1的不同：这里是一个字节一个字节读取的，放入字节数组里
 */

public class ReaderTest2 {
public static void main(String[] args)throws Exception{
    File file=new File("D://java测试文件.txt");
    Reader reader=new FileReader(file);
    char []c=new char[1024];
    int temp=0;
    int len=0;
    while ((temp=reader.read())!=-1){
        c[len++]= (char) temp;
    }
    reader.close();
    System.out.println("读取的内容为："+new String(c,0,len));
}
}
