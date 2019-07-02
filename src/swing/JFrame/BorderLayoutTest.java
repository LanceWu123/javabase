package swing.JFrame;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName: BorderLayoutTest
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/22 14:41
 * Description:
 */

public class BorderLayoutTest {
public static void main(String[] args){
    JFrame jf=new JFrame("BorderLayout测试");//创建窗体并命名
    jf.setLayout(new BorderLayout(5,5));//设置border布局并设置按钮间隔
    jf.add(new JButton("东"),BorderLayout.EAST);
    jf.add(new JButton("西"),BorderLayout.WEST);
    jf.add(new JButton("南"),BorderLayout.SOUTH);
    jf.add(new JButton("北"),BorderLayout.NORTH);
    jf.add(new JButton("中"),BorderLayout.CENTER);
    jf.setLocation(700,400);//设置窗体出现位置
    jf.setSize(500,200);//设置窗体大小
    jf.setVisible(true);//让窗体可视化
    jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
}
