package swing.JFrame;

import javax.swing.*;

/**
 * ClassName: JButtonTest
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/22 13:05
 * Description:
 */

public class JButtonTest {
public static void main(String[] args){
    JFrame jf=new JFrame("JButton测试");//创建窗体并命名
    JButton jb=new JButton("按钮");
    jf.add(jb);
    jf.setLocation(700,400);//设置窗体出现位置
    jf.setSize(500,200);//设置窗体大小
    jf.setVisible(true);//让窗体可视化
    jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
}
