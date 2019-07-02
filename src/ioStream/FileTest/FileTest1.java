package ioStream.FileTest;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: FileTest1
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/22 20:21
 * Description:
 */

public class FileTest1 {
public static void main(String[] args) throws IOException {
    File file=new File("D://创建的文件夹");
    //创建虚拟目录
    boolean b=file.mkdir();
    if(b){
        System.out.println("目录创建成功");
        //创建文件
        file=new File("D:/创建的文件夹/test");
        b=file.createNewFile();
        if(b){
            System.out.println("创建文件成功");
        }else {System.out.println("创建文件失败");}
    }
    else{
        System.out.println("目录创建失败");
    }
}
}
