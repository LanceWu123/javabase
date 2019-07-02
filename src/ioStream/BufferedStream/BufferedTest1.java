package ioStream.BufferedStream;

import java.io.*;

/**
 * ClassName: BufferedTest1
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/23 16:33
 * Description:
 */

/**
 * 分别用缓存方式和非缓存方式复制文件
 * 结论：缓存方式复制比非缓存快
 */


public class BufferedTest1 {
/**
 * 以缓存方式复制文件
 */
public static void bufferstream() throws Exception{
    BufferedInputStream bufferedinputStream=new BufferedInputStream(new FileInputStream("D://java测试文件.txt"));
    BufferedOutputStream bufferedoutputStream=new BufferedOutputStream(new FileOutputStream("D://java复制的文件2.txt"));
    int i=0;
    long startTime=System.currentTimeMillis();
    while((i=bufferedinputStream.read())!=-1){
        bufferedoutputStream.write(i);
    }
    bufferedinputStream.close();
    bufferedoutputStream.close();
    long endtime=System.currentTimeMillis();
    System.out.println("缓存复制文件消耗的时间为："+(endtime-startTime)+"毫秒");
}

    /**
     * 非缓存方式复制文件
     */
    public static void stream() throws Exception{
        InputStream inputStream=new FileInputStream("D://java测试文件.txt");
        OutputStream outputStream=new FileOutputStream("D://java复制的文件1.txt");
        int i=0;
        long startTime=System.currentTimeMillis();
        while((i=inputStream.read())!=-1){
            outputStream.write(i);
        }
        inputStream.close();
        outputStream.close();
        long endtime=System.currentTimeMillis();
        System.out.println("非缓存复制文件消耗的时间为："+(endtime-startTime)+"毫秒");
    }
public static void main(String[] args) throws Exception{
stream();
bufferstream();
}
}
