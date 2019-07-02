package ioStream.FileTest;

import java.io.File;

/**
 * ClassName: FileTest4
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/22 21:03
 * Description:
 */

public class FileTest4 {
    public static void listFile(File file){
        //当file非空
        if(file!=null){
            //当file是目录
            if(file.isDirectory()){

           File[] f=file.listFiles();
           if(f!=null){
               for(int i=0;i<f.length;i++){

                       listFile(f[i]);
                   }
               }
           }
            //当file是文件
           else{
                System.out.println(file);
            }
            }


        }

public static void main(String[] args) {
File file=new File("D:/a");
FileTest4.listFile(file);
}
}
