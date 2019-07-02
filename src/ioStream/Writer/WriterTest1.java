package ioStream.Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 * ClassName: WriterTest1
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/23 17:34
 * Description:
 */

public class WriterTest1 {
public static void main(String[] args)throws Exception{
    File file=new File("D://java测试文件.txt");
    //以下为覆盖写入，需要追加写入，则改为FileWriter（file,true）
    Writer writer=new FileWriter(file);
    String str="writer写入";
    writer.write(str);
    writer.close();
}
}
