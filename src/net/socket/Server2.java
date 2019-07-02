package net.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: Server1
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/3 10:48
 * Description:
 */

public class Server2 {
public static void main(String[] args){
    try {

        ServerSocket ss = new ServerSocket(8888);

        System.out.println("监听在端口号:8888");
        Socket s = ss.accept();

        //打开输入流
        InputStream is = s.getInputStream();

        //读取客户端发送的数据
        int msg = is.read();
        //打印出来
        System.out.println(msg);
        is.close();

        s.close();
        ss.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

}
}
