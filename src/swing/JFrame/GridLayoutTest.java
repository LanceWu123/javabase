package swing.JFrame;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName: GridLayoutTest
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/22 14:49
 * Description:
 */

public class GridLayoutTest {
    public static void main(String[] args) {
        JFrame jf = new JFrame("GridLayout测试");//创建窗体并命名
        jf.setLayout(new GridLayout(4, 5, 5, 5));//设置表格布局（4行5列）并设置间隔
        JButton jb = null;
        for (int i = 0; i < 19; i++) {
            jb = new JButton("JButton" + i);
            jf.add(jb);
        }


        jf.setLocation(700, 400);//设置窗体出现位置
        jf.setSize(500, 200);//设置窗体大小
        jf.setVisible(true);//让窗体可视化
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
