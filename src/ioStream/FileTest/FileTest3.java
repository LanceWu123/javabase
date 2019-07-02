package ioStream.FileTest;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: FileTest3
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/22 20:39
 * Description:
 */

public class FileTest3 {
public static void main(String[] args) throws IOException {
    File file=new File("D:/数据库");
    //遍历目录
    File[] f=file.listFiles();
    for(int i=0;i<f.length;i++){
        System.out.print(f[i]);
        if(f[i].isDirectory()){
            System.out.println("    "+"目录");
        }else if(f[i].isFile()){
            System.out.println("    "+"文件");
        }

    }
    System.out.println("此目录下共有"+f.length+"个文件和目录");
}
}
