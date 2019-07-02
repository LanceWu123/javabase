package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ClassName: Ping
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/30 11:45
 * Description:
 */

public class Ping {
    public static void main(String[] args) throws IOException {

        Process p = Runtime.getRuntime().exec("ping " + "10.243.0.191");
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(),("GBK")));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            if (line.length() != 0)
            { sb.append(line + "\r\n");}
        }
        System.out.println("本次指令返回的消息是：");
        System.out.println(sb.toString());
    }
}
