package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName: GetIP
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/30 11:39
 * Description:
 */

public class GetIP {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress host = InetAddress.getLocalHost();
        String ip =host.getHostAddress();
        System.out.println("本机ip地址：" + ip);
    }
}
