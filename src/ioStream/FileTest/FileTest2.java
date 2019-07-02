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

public class FileTest2 {
    public static void main(String[] args) throws IOException {
        //删除文件
        File file = new File("D:/创建的文件夹/test");
        if(file.exists()){
            boolean b=file.delete();
            if(b){
                System.out.println("删除文件成功");
            }else{
                System.out.println("删除文件失败");
            }
        }else{
            System.out.println("文件不存在");
        }
        //删除目录
        file = new File("D:/创建的文件夹");
        if(file.exists()){
            boolean b=file.delete();
            if(b){
                System.out.println("删除目录成功");
            }else{
                System.out.println("删除目录失败");
            }
        }else{
            System.out.println("目录不存在");
        }
    }
}
