package net.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ClassName: Client1
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/3 10:48
 * Description:
 */

/**
 * 1. 服务端开启8888端口，并监听着，时刻等待着客户端的连接请求
 * 2. 客户端知道服务端的ip地址和监听端口号，发出请求到服务端
 * 客户端的端口地址是系统分配的，通常都会大于1024
 * 一旦建立了连接，服务端会得到一个新的Socket对象，该对象负责与客户端进行通信。
 * 注意： 在开发调试的过程中，如果修改过了服务器Server代码，要关闭启动的Server,否则新的Server不能启动，因为8888端口被占用了
 */
public class Client1 {
public static void main(String[] args){
    try {
        //连接到本机的8888端口
        Socket s = new Socket("127.0.0.1",8888);
        System.out.println(s);
        s.close();
    } catch (UnknownHostException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
